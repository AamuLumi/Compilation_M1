public class Environment{
	private VarTree varRoot;
	private FunctionTree functionRoot;

	public Environment()
	{
		this.varRoot = new VarTree();
		this.functionRoot = new FunctionTree();
	}

	public VarTree getVarRoot()
	{
		return varRoot;
	}

	public boolean addVariable(Variable v){
		System.out.println("Adding " + v.getName() + " with type " + v.getType());
		boolean res = VarTree.add(v, this.varRoot);
		displayVariableTree(varRoot, 0);
		System.out.println("");

		return res;
	}

	public void displayVariableTree(VarTree node, int tab){
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < tab; i++)
			s.append('\t');

		System.out.println(s.toString() + node.toString());
		if (node.getLeftChild() != null)
			displayVariableTree(node.getLeftChild(), tab+1);
		if (node.getRightChild() != null)
			displayVariableTree(node.getRightChild(), tab+1);
	}

	public boolean isDefined(String name){
		return VarTree.searchVariable(new Variable(name, null), this.varRoot);
	}
}
