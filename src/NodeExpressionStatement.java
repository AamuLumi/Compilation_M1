import java.util.Vector;

public class NodeExpressionStatement extends NodeStatement{

	public NodeExpressionStatement(NodeExpression e){
		super();
		this.tag = EnumTag.EXPRESSION_STATEMENT;
		this.addChild(e);
	}
	
	public NodeExpressionStatement(Vector<ArbSynt> v){
		super();
		this.tag = EnumTag.EXPRESSION_STATEMENT;
		this.children = v;
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
