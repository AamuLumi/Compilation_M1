public class NodeIfStatement extends NodeStatement {

	public NodeIfStatement(NodeExpression condition, NodeStatement ifBlock){
		this.tag = EnumTag.IF;
		this.addChild(condition);
		this.addChild(ifBlock);
	}

	public NodeIfStatement(NodeExpression condition, NodeStatement ifBlock, NodeStatement elseBlock){
		this.tag = EnumTag.IFELSE;
		this.addChild(condition);
		this.addChild(ifBlock);
		this.addChild(elseBlock);
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
