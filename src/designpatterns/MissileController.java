package designpatterns;

public class MissileController {

	private static MissileController instance;
	LaunchMissile lm;
	BlastMissile bm;
	
	public MissileController getInstance() {
		if(instance == null) {
			instance = new MissileController();
		}
		return instance;
		
	}
	
	void performLaunching(String start){
		this.lm.initiateOperation(start);
	}
	
	void performBlasting(String end){
		this.lm.initiateOperation(end);
	}
}
