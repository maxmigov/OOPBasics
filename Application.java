import marine.Fish;
import marine.FishFactory;

public class Application {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
//		 SeeFish fish1 = new SeeFish("tuna", "20 kg","ocean");
//	
//		 System.out.println(fish1);
//		 
//		 SeeFish fish2 = (SeeFish) fish1.clone();
//		 
//		 System.out.println(fish2);
//		 
//		 System.out.println(fish1.equals(fish2));
		 
	//	 RiverFish fish60 = new RiverFish("salmon", "50kg", "Dnepr");
	//	 System.out.println(fish60);
	//	 RiverFish fish61 = (RiverFish) fish60.clone();
	//	 fish61.setType("not a fish");
	//	 System.out.println(fish61);
	//	 System.out.println(fish60.equals(fish61));
		 
		 FishFactory factory = new FishFactory();
		 Fish fishnewbla = (Fish) factory.getFish("Sea", "dsad", "323", "uk");
		 System.out.println(fishnewbla.toString());
		 
		 
			
		 
				 
	}

}
