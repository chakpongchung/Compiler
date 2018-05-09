package Compiler.CFG.Instruction;

import Compiler.CFG.Operand.AddressOperand;
import Compiler.CFG.Operand.Operand;
import Compiler.CFG.Operand.VirtualRegister;

import java.util.HashSet;

public class MoveInstruction extends Instruction {
    private Operand target, source;

    public MoveInstruction(Operand target, Operand source) {
        if (target instanceof AddressOperand && source instanceof AddressOperand) {
            throw new InternalError("Move Instruction can't handle two address");
        }
        this.target = target;
        this.source = source;
        init();
    }

    private void init() {
        killSet = new HashSet<>();
        useSet = new HashSet<>();
        if (target instanceof VirtualRegister) {
            killSet.add((VirtualRegister) target);
        }
        if (target instanceof AddressOperand) {
            useSet.add(((AddressOperand) target).getBase());
        }
        if (source instanceof VirtualRegister) {
            useSet.add((VirtualRegister) source);
        }
        if (source instanceof AddressOperand) {
            useSet.add(((AddressOperand) source).getBase());
        }
    }

    public Operand getTarget() {
        return target;
    }

    public void setTarget(Operand target) {
        this.target = target;
        init();
    }

    public Operand getSource() {
        return source;
    }

    public void setSource(Operand source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format("%s = mov %s", target, source);
    }
}
