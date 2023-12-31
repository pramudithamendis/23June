package designpatterns;

public class RocketMissileSystem implements MissileSystem {
	
	private static RocketMissileSystem instance;

	MissileOperation mo;
	
	
	public static RocketMissileSystem getInstance() {
		
		if(instance == null) {
			instance = new RocketMissileSystem();
			System.out.println("Initialize Rocket missile System. . .");
		}
		return instance;
	}
	
	public void setMO(MissileOperation mo) {
		this.mo = mo;
	}
	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		mo.initiateOperation(source);
		System.out.println("At RMS-Launch");
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		mo.initiateOperation(destination);
		
		System.out.println("At RMS-Blast");
	}

}
