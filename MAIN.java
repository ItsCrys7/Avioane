import java.io.PrintStream;

public class MAIN {

	public static void main(int[] args) {
	
	Concorde avion1 = new Concorde (50, 1, 200);
	Boeing avion2 = new Boeing (50, 2, 400);
	TomCat avion3 = new TomCat (3, 400);
	Mig avion4 = new Mig (4, 400);
	Concorde avion5 = new Concorde (50, 5, 400);
	Boeing avion6 = new Boeing (50, 6, 400);
	TomCat avion7 = new TomCat (7, 400);
	Mig avion8 = new Mig (8, 400);
	
	
	avion1.fly();
	avion2.getTotalEnginePower();
	}
}
