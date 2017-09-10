package implementacionMonster;

public class Principal {

	public static void main(String[] args) {
		Monster f1, w2, s3;
		
		f1 = new FireMonster(" Rodan ");
		
		System.out.println(f1.attack());
		
		w2 = new WaterMonster(" Baragon ");
		
		System.out.println(w2.attack());
		
		s3 = new StoneMonster(" Kumonga ");
		
		System.out.println(s3.attack());

	}

}
