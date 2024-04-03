public class Concorde extends AvioaneCalatori {

	
	public Concorde(int maxPassengers, int planeId, int totalEnginePower) {
		super(maxPassengers, planeId, totalEnginePower);
		}

	public void goSuperSonic() {
		System.out.println(getPlaneId() + "PlaneID Value-Supersonic mode activated");
	}
	
	
	public void goSubSonic() {
		System.out.println(getPlaneId() + "PlaneID Value-Supersonic mode deactivated");
	}
	
}
