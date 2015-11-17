public class VarTree extends Tree<VarTree>{

  private Variable v;

  public VarTree(){
    v = new Variable();
  }

  public VarTree(String name, Type t){
    v = new Variable(name, t);
  }

  public VarTree(String name, Type t, VarTree leftChild, VarTree rightChild){
    v = new Variable(name, t);
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }

  public String toString(){
    return "VarTree [" + v + "]";
  }

  /**
   * Add a new var to tree
   * @param   s : the name of variable
   * @param   ty : type of variable
   * @param   t : the root of tree
   * @return  true if added, false if already exist
   */
  public static boolean add(Variable v, VarTree t){
    if (t.getVariable().getName() == null){
      t.setVariable(v);

      return true;
    }
    else if (v.getName().compareTo(t.getVariable().getName()) < 0){
      if (t.getLeftChild() == null)
        t.setLeftChild(new VarTree());
      return VarTree.add(v, t.getLeftChild());
    }
    else if (v.getName().compareTo(t.getVariable().getName()) > 0){
      if (t.getRightChild() == null)
        t.setRightChild(new VarTree());
      return VarTree.add(v, t.getRightChild());
    }
    else
      return false;
  }

  public static boolean searchVariable(Variable v, VarTree n){
		if (n.getVariable().getName() == null)
			return false;

		if (n.getVariable().getName().equals(v.getName()))
			return true;
		else if (n.getLeftChild() != null && n.getRightChild() != null)
			return searchVariable(v, n.getLeftChild()) || searchVariable(v, n.getRightChild());
		else if (n.getLeftChild() != null)
			return searchVariable(v, n.getLeftChild());
		else if (n.getRightChild() != null)
			return searchVariable(v, n.getRightChild());
		else
			return false;
	}

  public Variable getVariable(){
    return this.v;
  }

  public void setVariable(Variable v){
    this.v = v;
  }

}
