package marine;

public class RiverFish extends Fish {

	RiverFish(String type, String weight, String environment) {// we are not able to access this constructor, package level
		super(type, weight, environment);
	}


	@Override
	public String toString() {
		return "RiverFish [type=" + getType() + ", weight=" + getWeight() + ", environment=" + getEnvironment() + "]";
	}

}
