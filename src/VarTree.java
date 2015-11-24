public class VarTree {

  private ObjectWithName v;
  private VarTree leftChild, rightChild;

  public VarTree(){
    v = null;
  }

  public VarTree(ObjectWithName o){
    this.v = o;
  }

  public VarTree(ObjectWithName o, VarTree leftChild, VarTree rightChild){
    this.v = o;
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
  public static boolean add(ObjectWithName v, VarTree t){
    if (t.getValue() == null){
      t.setValue(v);

      return true;
    }
    else if (v.getName().compareTo(t.getValue().getName()) < 0){
      if (t.getLeftChild() == null)
        t.setLeftChild(new VarTree());
      return VarTree.add(v, t.getLeftChild());
    }
    else if (v.getName().compareTo(t.getValue().getName()) > 0){
      if (t.getRightChild() == null)
        t.setRightChild(new VarTree());
      return VarTree.add(v, t.getRightChild());
    }
    else
      return false;
  }

  public static boolean search(String s, VarTree n){
		if (n.getValue() == null)
			return false;

		if (n.getValue().getName().equals(s))
			return true;
		else if (n.getLeftChild() != null && n.getRightChild() != null)
			return search(s, n.getLeftChild()) || search(s, n.getRightChild());
		else if (n.getLeftChild() != null)
			return search(s, n.getLeftChild());
		else if (n.getRightChild() != null)
			return search(s, n.getRightChild());
		else
			return false;
	}

  public ObjectWithName getValue(){
    return this.v;
  }

  public void setValue(ObjectWithName v){
    this.v = v;
  }

  public VarTree getLeftChild(){
    return leftChild;
  }

  public void setLeftChild(VarTree v){
    this.leftChild = v;
  }

  public VarTree getRightChild(){
    return rightChild;
  }

  public void setRightChild(VarTree v){
    this.rightChild = v;
  }

}
