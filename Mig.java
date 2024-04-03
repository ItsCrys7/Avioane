public class Mig extends AvioaneLupta{
	
	public Mig(int planeId, int totalEnginePower) {
		super (planeId, totalEnginePower);
	}
	
	public void hughSpeedGeometry() {
		System.out.println(getPlaneId() + "PlaneID Value-High speed geometry selected");
	}
	
	public void normalGeometry() {
		System.out.println(getPlaneId() + "PlaneID Value-Normal geometry selected");
	}

}

