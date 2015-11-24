
public class Type {
	public static Type CHAR = new Type("char");
	public static Type INT = new Type("int");
	public static Type FLOAT = new Type("float");
	public static Type STRING = new Type("string");
	public static Type BOOLEAN = new Type("bool");
	public static Type ARRAY = new Type("array");
	public static Type POINTER = new Type("pointer");
	public static Type NULL = new Type("null");
	public static Type ERROR = new Type("error");

  private String tag;
	private Type subType;

	public Type(String s){
    tag = s;
		this.subType = null;
  }

  public Type(String s, Type subType){
    tag = s;
		this.subType = subType;
  }

  public String toString(){
		StringBuffer s = new StringBuffer();
		s.append(tag);

		if (subType != null)
			s.append(' ' + subType.toString());

		return s.toString();
  }

	public boolean equals(Object o){
		if (o instanceof Type){
			Type t = (Type)o;
			return t.getMainType().equals(this.tag) && t.getSubType().equals(this.subType);
		}

		return false;
	}

	public String getMainType(){
		return tag;
	}

	public Type getSubType(){
		return subType;
	}
}
