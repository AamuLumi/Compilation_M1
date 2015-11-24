
public class NodeLoopStatement extends NodeStatement {
	
	public NodeLoopStatement(String varName, NodeExpression inExpr, NodeStatement st){
		super();
		// ForEeach constructor
		this.tag = EnumTag.FOREACH;
		this.addChild(new NodeVar(varName));
		this.addChild(inExpr);
		this.addChild(st);
	}
	
	public NodeLoopStatement(NodeExpression expr, NodeStatement st){
		super();
		// While constructor
		this.tag = EnumTag.WHILE;
		this.addChild(expr);
		this.addChild(st);
	}
	
	public NodeLoopStatement(NodeStatement st, NodeExpression expr){
		super();
		// Repeat constructor
		this.tag = EnumTag.REPEAT;
		this.addChild(expr);
		this.addChild(st);
	}
	
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkType() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String translate() {
		// TODO Auto-generated method stub
		return null;
	}

}
