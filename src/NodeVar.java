public class NodeVar extends NodeExpression {

	public NodeVar(String name){
		this.name = name;
		this.tag = EnumTag.VAR;
	}

	public NodeVar(String name, Type t){
		this.name = name;
		this.type = t;
		this.tag = EnumTag.VAR;
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
