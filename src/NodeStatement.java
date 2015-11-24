import java.util.Vector;

public class NodeStatement extends ArbSynt{

	public NodeStatement(){
		super();
		this.tag = EnumTag.STATEMENT;
	}

	public NodeStatement(Vector<ArbSynt> ins){
		this.tag = EnumTag.STATEMENT;
		this.children = ins;
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
