package implementacionMonster;

public class StoneMonster implements Monster {

	private String name;
	
	public StoneMonster(String name) {
		this.name = name;
	}
	
	public String attack() {
		
		return "Yo soy un monstruo de Piedra y me dicen:" + this.name;
	}
}
