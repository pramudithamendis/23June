package designpatterns;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MissileOperation lm = new LaunchMissile();	
		MissileOperation bm = new BlastMissile();
		MissileSystem hms = HeatMissileSystem.getInstance();
		MissileController mc = MissileController.getInstance();
		
		
		hms.setMO(lm);

		mc.setMS(hms);

		
		mc.performLaunching("Colombo");
		
		hms.setMO(bm);
		mc.performBlasting("Col2");
		
//		System.out.println("Hi");
		

	}

}
