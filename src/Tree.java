public abstract class Tree<V> {

  protected V leftChild, rightChild;

  public V getLeftChild(){
    return leftChild;
  }

  public void setLeftChild(V v){
    this.leftChild = v;
  }

  public V getRightChild(){
    return rightChild;
  }

  public void setRightChild(V v){
    this.rightChild = v;
  }
}
