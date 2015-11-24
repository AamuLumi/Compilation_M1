
public class NodeArray extends NodeExpression {

	public NodeArray(NodeExpression e){
		super();
		this.addChild(e);
		this.tag = EnumTag.ARRAY;
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
