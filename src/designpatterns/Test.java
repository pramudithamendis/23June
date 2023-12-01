package designpatterns;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MissileSystem hms = new HeatMissileSystem();
//		MissileSystem rms = new RocketMissileSystem();
		
		MissileSystem hms = HeatMissileSystem.getInstance();
		MissileSystem rms = RocketMissileSystem.getInstance();
		MissileController mc = MissileController.getInstance();
		
		
//		System.out.println("Hi");
		

	}

}
