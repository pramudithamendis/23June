package designpatterns;

public class HeatMissileSystem implements MissileSystem {
	
	private static HeatMissileSystem instance;
	private String source;
	private String destination;
	
	public static HeatMissileSystem getInstance() {
		
		if(instance == null) {
			instance = new HeatMissileSystem();
			System.out.println("Initialize Heat missile System. . .");
		}
		return instance;
	}

	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		this.source = source;
		System.out.println("HMS from " + source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		this.destination = destination;
		System.out.println("HMS to " + source);
	}

}
