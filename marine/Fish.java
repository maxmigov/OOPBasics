package marine;

public abstract class Fish implements FishInterface, Cloneable {
	private String type;
	private String weight;
	private String environment;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public Fish(String type, String weight, String environment) {
		this.type = type;
		this.weight = weight;
		this.environment = environment;
	}
	public Fish() {
	}
	@Override
	public String toString() {
		return "Fish [type=" + type + ", weight=" + weight + ", environment=" + environment + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	

}
