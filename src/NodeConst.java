public class NodeConst extends NodeExpression {

	public NodeConst(Type t, Object v){
		super();
		this.type = t;
		this.value = v;
		this.tag = EnumTag.CONST;
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
