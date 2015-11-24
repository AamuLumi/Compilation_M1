import java.util.Vector;

public class NodeDeclaration extends ArbSynt {

	public NodeDeclaration(NodeVar n){
		super();
		this.addChild(n);
		this.tag = EnumTag.DECLARATION;
	}

	public NodeDeclaration(NodeType n){
		super();
		this.addChild(n);
		this.tag = EnumTag.DECLARATION;
	}

	public NodeDeclaration(String varName, Type t){
		super();
		this.addChild(new NodeVar(varName, t));
		this.tag = EnumTag.DECLARATION;
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
