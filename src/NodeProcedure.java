import java.util.Vector;

public class NodeProcedure extends ArbSynt{

	private Vector<NodeVar> args;

	public NodeProcedure(String name, Vector<NodeVar> args, Vector<ArbSynt> ins){
		this.tag = EnumTag.PROCEDURE;
		this.name = name;
		this.args = args;
		this.children = ins;
	}

	public NodeProcedure(String name, Vector<NodeVar> args, ArbSynt ins){
		super();
		this.tag = EnumTag.PROCEDURE;
		this.name = name;
		this.args = args;
		this.children.add(ins);
	}

	public String toString(){
		String s = super.toString();

		s += "\nARGS=" + args + "";

		return s;
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
