package designpatterns;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MissileOperation lm = new LaunchMissile();	
		MissileSystem hms = HeatMissileSystem.getInstance();
		MissileController mc = MissileController.getInstance();
		
		
		hms.setMO(lm);
		mc.setMS(hms);

		
		mc.performLaunching("Colombo");
		mc.performBlasting("Col2");
		
//		System.out.println("Hi");
		

	}

}
