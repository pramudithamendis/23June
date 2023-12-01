package designpatterns;

public class HeatMissileSystem implements MissileSystem {
	
	private static HeatMissileSystem instance;

	
	MissileOperation mo;
	
	
	public static HeatMissileSystem getInstance() {
		
		if(instance == null) {
			instance = new HeatMissileSystem();
			System.out.println("Initialize Heat missile System. . .");
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
		System.out.println("HMS from " + source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		mo.initiateOperation(destination);
		
		System.out.println("HMS to " + destination);
	}

}
