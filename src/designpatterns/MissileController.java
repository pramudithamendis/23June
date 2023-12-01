package designpatterns;

public class MissileController {

	private static MissileController instance;
	
	MissileSystem ms;
	
	
	public MissileController getInstance() {
		if(instance == null) {
			instance = new MissileController();
		}
		return instance;
		
	}
	
	void setMS(MissileSystem ms) {
		this.ms = ms;
	}
	
	void performLaunching(String start){
		ms.launch(start);
		
	}
	
	void performBlasting(String end){
		ms.blast(end);
	}
}
