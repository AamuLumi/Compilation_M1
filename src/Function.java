import java.util.Vector;

public class Function extends ObjectWithName{

  public String name;
  public Vector<Variable> args;

  public Function(){
    this.name = null;
    this.args = null;
  }

  public Function(String name, Vector<Variable> args){
    this.name = name;
    this.args = args;
  }

  public String toString(){
    StringBuffer s = new StringBuffer();

    s.append("Function[name=" + this.name +" - Args[");
    for (Variable v : args)
      s.append(v + " - ");
    s.append("]]");

    return s.toString();
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public Vector<Variable> getArgs(){
    return this.args;
  }

  public void setArgs(Vector<Variable> args){
    this.args = args;
  }

}
