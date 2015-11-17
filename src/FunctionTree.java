public class FunctionTree extends Tree<FunctionTree>{

  private Function f;

  public FunctionTree(){
    f = new Function();
  }

  public FunctionTree(Function f){
    this.f = f;
  }

  public FunctionTree(Function f, FunctionTree leftChild, FunctionTree rightChild){
    this.f = f;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }
}
