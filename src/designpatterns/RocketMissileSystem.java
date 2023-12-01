package designpatterns;

public class RocketMissileSystem implements MissileSystem {
	
	private static RocketMissileSystem instance;
	private String source;
	private String destination;
	
	public static RocketMissileSystem getInstance() {
		
		if(instance == null) {
			instance = new RocketMissileSystem();
			System.out.println("Initialize Rocket missile System. . .");
		}
		return instance;
	}
	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		this.source = source;
		System.out.println("RMS from " + source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		this.destination = destination;
		System.out.println("RMS to " + destination);
		
	}

}
