public class TomCat extends AvioaneLupta{
	
	public TomCat(int planeId, int totalEnginePower) {
		super (planeId, totalEnginePower);
	}
	
	public void refuel() {
		System.out.println(getPlaneId() + "PlaneID Value-Initiating refueling procedure - Locating refueller - Catching up Refueling - Refueling complete.");
	}
	
}