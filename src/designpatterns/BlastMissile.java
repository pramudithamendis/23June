package designpatterns;

public class BlastMissile implements MissileOperation {

	private String location;
	@Override
	public void initiateOperation(String location) {
		// TODO Auto-generated method stub
		this.location = location;
		System.out.println("At Blast: "+ location);
		
		
	}

}
