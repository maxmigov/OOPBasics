package marine;

public class SeeFish extends Fish{ 

	SeeFish(String type, String weight, String environment) {// we are not able to access this constructor, package level
		super(type, weight, environment);
	}

	
	@Override
	public String toString() {
		return "SeeFish [type=" + getType() + ", weight=" + getWeight() + ", environment=" + getEnvironment() + "]";
	}
	
}
