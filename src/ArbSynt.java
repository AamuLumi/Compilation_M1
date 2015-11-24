import java.util.Vector;

public abstract class ArbSynt{

	protected EnumTag tag;
	protected Vector<ArbSynt> children;
	protected Type type;
	protected String name;
	protected Object value;

	public ArbSynt(){
		this.children = new Vector<ArbSynt>();
	}

	public String toString(){
		StringBuffer s = new StringBuffer();

		s.append(tag + "[");
		if (name != null) s.append("name=" + name + " - ");
		if (type != null) s.append("type=" + type + " - ");
		if (value != null) s.append("value=" + value + " - ");
		if (name != null || value != null || type != null) s.delete(s.lastIndexOf("-"), s.length());
		if (children.size() > 0){
			s.append("children=[");
			for (ArbSynt c : children)
				s.append("\n" + c + ", ");
			s.delete(s.lastIndexOf(","), s.length());
		}
		s.append("]");

		return s.toString().replaceAll("\n", "\n\t");
	}

	public abstract int eval();
	public abstract boolean checkType();
	public abstract String translate();

	public EnumTag getTag() {
		return tag;
	}
	public void setTag(EnumTag tag) {
		this.tag = tag;
	}
	public Vector<ArbSynt> getChildren() {
		return this.children;
	}
	public void addChild(ArbSynt child) {
		this.children.add(child);
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}

}
