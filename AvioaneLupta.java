public class AvioaneLupta extends Avioane {

	public AvioaneLupta (int planeId, int totalEnginePower) {
		super (planeId, totalEnginePower);
	}

	public void launchMissile() {
		System.out.println(getPlaneId() + "PlaneID Value-Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete.");
	}
	
	
}
