
public class NodeCall extends NodeExpression{

	public NodeCall(NodeExpression e){
		super(e);
		this.tag = EnumTag.CALL;
	}
	
	public NodeCall(NodeExpression e1, NodeExpression e2){
		super(e1, e2);
		this.tag = EnumTag.CALL;
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
