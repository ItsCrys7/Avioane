
public class Avioane {

	private int planeId;
	private int totalEnginePower;
	
	public Avioane(int planeId, int totalEnginePower) {
		this.planeId = planeId;
		this.totalEnginePower = totalEnginePower;
	}

	public int getPlaneId() {
		return planeId;
	}
	
	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	public void takeOff() {
		System.out.println(getPlaneId() + "PlaneID Value-Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking Off - Retracting gear - TakeOff complete");
	}
	 
	public void land() {
		System.out.println(getPlaneId() + "PlaneID Value-Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
	}
	
	public void fly() { 
		System.out.println(getPlaneId() + "PlaneID Value-Flying");
	}
	
	
}
