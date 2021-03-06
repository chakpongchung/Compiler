// Generated from /Users/resolution/Documents/GitHub/Compiler/src/Compiler/Front/Parser/Mxstar.g4 by ANTLR 4.7
package Compiler.Front.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxstarParser}.
 */
public interface MxstarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxstarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxstarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxstarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(MxstarParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(MxstarParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MxstarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MxstarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MxstarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MxstarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MxstarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MxstarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MxstarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MxstarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MxstarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MxstarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MxstarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MxstarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MxstarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MxstarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MxstarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MxstarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MxstarParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MxstarParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MxstarParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MxstarParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MxstarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MxstarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolConstant(MxstarParser.BoolConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolConstant(MxstarParser.BoolConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntConstant(MxstarParser.IntConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntConstant(MxstarParser.IntConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(MxstarParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(MxstarParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullConstant(MxstarParser.NullConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullConstant}
	 * labeled alternative in {@link MxstarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullConstant(MxstarParser.NullConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MxstarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MxstarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MxstarParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MxstarParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(MxstarParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(MxstarParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(MxstarParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(MxstarParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MxstarParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classType}
	 * labeled alternative in {@link MxstarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MxstarParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(MxstarParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(MxstarParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(MxstarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(MxstarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(MxstarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(MxstarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOrExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(MxstarParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOrExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(MxstarParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MxstarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MxstarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpression(MxstarParser.SubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpression(MxstarParser.SubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(MxstarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(MxstarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MxstarParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MxstarParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MxstarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MxstarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MxstarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MxstarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(MxstarParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(MxstarParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newClassExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewClassExpression(MxstarParser.NewClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newClassExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewClassExpression(MxstarParser.NewClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitXorExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitXorExpression(MxstarParser.BitXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitXorExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitXorExpression(MxstarParser.BitXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(MxstarParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(MxstarParser.MemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(MxstarParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(MxstarParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAndExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(MxstarParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAndExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(MxstarParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MxstarParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MxstarParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suffixExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSuffixExpression(MxstarParser.SuffixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suffixExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSuffixExpression(MxstarParser.SuffixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MxstarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MxstarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(MxstarParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(MxstarParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(MxstarParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(MxstarParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayExpression(MxstarParser.NewArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayExpression(MxstarParser.NewArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MxstarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MxstarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(MxstarParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MxstarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(MxstarParser.SubExpressionContext ctx);
}