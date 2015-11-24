
public class NodeExpression extends ArbSynt{
	
	public NodeExpression(){
		super();
		this.tag = EnumTag.EXPRESSION;
	}
	
	public NodeExpression(NodeExpression e){
		super();
		this.tag = EnumTag.EXPRESSION;
		this.addChild(e);
	}
	
	public NodeExpression(NodeOperator o, NodeExpression e){
		super();
		this.tag = EnumTag.EXPRESSION;
		this.addChild(o);
		this.addChild(e);
	}
	
	public NodeExpression(NodeExpression e1, NodeExpression e2){
		super();
		this.tag = EnumTag.EXPRESSION;
		this.addChild(e1);
		this.addChild(e2);
	}
	
	public NodeExpression(NodeOperator o, NodeExpression e1, NodeExpression e2){
		super();
		this.tag = EnumTag.EXPRESSION;
		this.addChild(o);
		this.addChild(e1);
		this.addChild(e2);
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
