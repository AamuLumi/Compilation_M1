
public class NodeLogicalExpression extends NodeExpression {

	public NodeLogicalExpression(NodeOperator o, NodeExpression e1, NodeExpression e2){
		super(o, e1, e2);
		this.tag = EnumTag.LOGICAL_EXPRESSION;
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
