package Compiler.CFG.Instruction;

import Compiler.AST.Type.FunctionType;
import Compiler.CFG.FunctionIR;
import Compiler.CFG.Operand.*;
import Compiler.Trans.PhysicalOperand.PhysicalOperand;
import Compiler.Trans.Translator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FunctionCallInstruction extends Instruction {
    private FunctionType functionType;
    private VirtualRegister returnValue;
    private List<Operand> operandList;

    public FunctionCallInstruction(FunctionType functionType, VirtualRegister returnValue, List<Operand> operandList) {
        this.functionType = functionType;
        this.returnValue = returnValue;
        this.operandList = operandList;
        buildSet();
    }

    public FunctionType getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionType functionType) {
        this.functionType = functionType;
    }

    public List<Operand> getOperandList() {
        return operandList;
    }

    public void convertFunctionType(FunctionType functionType) {
        this.functionType = functionType;
    }

    @Override
    public void buildSet() {
        killSet = new HashSet<>();
        useSet = new HashSet<>();
        if (returnValue != null) {
            killSet.add(returnValue);
        }
        for (Operand operand : operandList) {
            if (operand instanceof VirtualRegister) {
                useSet.add((VirtualRegister) operand);
            }
            if (operand instanceof ImmediateAddressOperand) {
                useSet.add(((ImmediateAddressOperand) operand).getBase());
            }
            if (operand instanceof RegisterAddressOperand) {
                useSet.add(((RegisterAddressOperand) operand).getBase());
                useSet.add(((RegisterAddressOperand) operand).getOffset());
            }
        }
    }

    @Override
    public boolean hasGlobalImpact() {
        for (Operand operand : operandList) {
            if (operand instanceof MemoryLabel || operand instanceof ImmediateAddressOperand) return true;
            if (operand instanceof VirtualRegister && ((VirtualRegister) operand).isGlobal()) return true;
        }
        if (functionType.isBuiltin()) return true;
        return false;
    }

    @Override
    public void replaceVirtualRegister(VirtualRegister older, VirtualRegister newer) {
        returnValue = (VirtualRegister) returnValue.getReplaced(older, newer);
        for (int i = 0; i < operandList.size(); i++) {
            Operand operand = operandList.remove(i);
            operandList.add(i, operand.getReplaced(older, newer));
        }
        buildSet();
    }

    @Override
    public void init() {
        operandList.forEach(Operand::init);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("call %s", functionType.getIRName()));
        operandList.forEach(operand -> str.append(" ").append(operand.toString()));
        str.append(String.format(" return value = %s", returnValue));
        return str.toString();
    }

    @Override
    public String getAssembly() {
        StringBuilder str = new StringBuilder();
        List<String> callerList = new ArrayList<>();

        for(VirtualRegister virtualRegister: liveOut) {
            if (Translator.getCurrentFunctionIR().getRegisterStringMap().containsKey(virtualRegister)) {
                String name = Translator.getCurrentFunctionIR().getRegisterStringMap().get(virtualRegister);
                if (FunctionIR.callerSavedRegisterList.contains(name)) {
                    callerList.add(name);
                }
            }
        }

        str.append(Translator.getCallerSaved(callerList));
        int frameSize = operandList.size();

        if ((Translator.getOffset() + frameSize) % 2 == 1) {
            ++frameSize;
            str.append(Translator.getInstruction("sub", "rsp", "8"));
            Translator.addOffset(1);
        }

        for (int i = operandList.size() - 1; i >= 0; i--) {
            PhysicalOperand physicalOperand = operandList.get(i).getPhysicalOperand(str);
            str.append(Translator.getInstruction("push", physicalOperand.toString()));
        }
        str.append(Translator.getInstruction("call", functionType.getIRName()));

        Translator.subOffset(frameSize);

        if (frameSize > 0) {
            str.append(Translator.getInstruction("add", "rsp", String.valueOf(frameSize * 8)));
        }

        str.append(Translator.getCallerRestored(callerList));

        return str.toString();
    }
}
