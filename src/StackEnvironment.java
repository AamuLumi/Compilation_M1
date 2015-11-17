import java.util.Stack;

public class StackEnvironment{
	Stack<Environment> s;

	public StackEnvironment()
	{
		this.s = new Stack<Environment>();
		this.addEnvironment();
	}

	public Environment getCurrentEnvironment(){
		return s.peek();
	}

	public void addEnvironment()
	{
		s.push(new Environment());
	}

	public void deleteEnvironment()
	{
		s.pop();
	}

	public boolean existInOneEnvironment(String name){
		for (Environment e : s)
			if (e.isDefined(name))
				return true;

		return false;
	}

	public boolean existInCurrentEnvironment(String name){
		return getCurrentEnvironment().isDefined(name);
	}
}
