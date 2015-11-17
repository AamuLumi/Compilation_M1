public class Variable{

  private String name;
  private Type type;

  public Variable(){
    this.name = null;
    this.type = null;
  }

  public Variable(String name, Type t){
    this.name = name;
    this.type = t;
  }

  public String toString(){
    return "Variable [" + this.name + " - " + this.type + "]";
  }

  public String getName(){
    return name;
  }

  public void setName(String s){
    this.name = s;
  }

  public Type getType(){
    return type;
  }

  public void setType(Type t){
    this.type = t;
  }

}
