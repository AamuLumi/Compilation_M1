
public class NodeEndStatement extends NodeStatement{

	public NodeEndStatement(String name){
		if (name.equals("stop"))
			this.tag = EnumTag.STOP;
		else if (name.equals("break"))
			this.tag = EnumTag.BREAK;
		else if (name.equals("return"))
			this.tag = EnumTag.RETURN;

		this.name = name;
	}

	public NodeEndStatement(NodeExpression returnExpr){
		super();
		this.tag = EnumTag.RETURN;
		this.name = "return";
		this.children.add(returnExpr);
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
