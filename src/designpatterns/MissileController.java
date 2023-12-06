package designpatterns;

public class MissileController {

	private static MissileController instance;
	
	MissileSystem ms;
	
	
	public static MissileController getInstance() {
		if(instance == null) {
			instance = new MissileController();
			System.out.println("Initialize Heat missile System. . .");
		}
		return instance;
		
	}
	
	void setMS(MissileSystem ms) {
		this.ms = ms;
	}
	
	void performLaunching(String start){
		ms.launch(start);
		System.out.println("At MC-Launch");
		
	}
	
	void performBlasting(String end){
		ms.blast(end);
		System.out.println("At MC-Blast");
	}
}
