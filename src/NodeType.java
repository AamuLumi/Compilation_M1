
public class NodeType extends ArbSynt{
	
	public NodeType(String name, Type t){
		this.tag = EnumTag.TYPE;
		this.name = name;
		this.type = t;
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
