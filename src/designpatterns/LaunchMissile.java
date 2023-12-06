package designpatterns;

public class LaunchMissile implements MissileOperation{

	private String location;
	@Override
	public void initiateOperation(String location) {
		// TODO Auto-generated method stub
		this.location = location;
		System.out.println("At Launch"+ location);
	}

}
