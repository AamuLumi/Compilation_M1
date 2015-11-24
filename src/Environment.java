public class Environment{
	private VarTree varRoot;

	public Environment()
	{
		this.varRoot = new VarTree();
	}

	public VarTree getVarRoot()
	{
		return varRoot;
	}

	public boolean add(Variable v){
		//System.out.println("Adding " + v.getName() + " with type " + v.getType());
		boolean res = VarTree.add(v, this.varRoot);
		//displayVariableTree(varRoot, 0);
		//System.out.println("");

		return res;
	}

	public boolean add(Function f){
		System.out.println("Adding " + f.getName() + " with type " + f.getArgs());
		boolean res = VarTree.add(f, this.varRoot);
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
		return VarTree.search(name, this.varRoot);
	}
}
