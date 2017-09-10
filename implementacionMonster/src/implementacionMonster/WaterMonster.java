package implementacionMonster;

public class WaterMonster implements Monster {

	private String name;
	
	public WaterMonster(String name) {
		this.name = name;
	}
	
	public String attack() {
		return "Yo soy un monstruo de Agua y me dicen: " + this.name;
		
	}
	
}
