package marine;

public class FishFactory {

	public FishInterface getFish(String fishClass, String type, String weight, String environment) {
		FishInterface fish = null;
		
		if (fishClass == null) {
			return null;
		}
		if (fishClass.equalsIgnoreCase("River")) {
			fish = new RiverFish(type, weight, environment);
		}
		else if (fishClass.equalsIgnoreCase("Sea")) {
			fish = new SeeFish(type, weight, environment);
		}
			return fish;
		}
	
	public FishInterface cloneFish() {
		
		
		
	}
}
