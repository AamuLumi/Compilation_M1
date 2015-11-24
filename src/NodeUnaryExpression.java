
public class NodeUnaryExpression extends NodeExpression{

	public NodeUnaryExpression(NodeOperator o, NodeExpression e){
		super();
		this.addChild(o);
		this.addChild(e);
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
