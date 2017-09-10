package implementacionMonster;

public class FireMonster implements Monster {
	
	private String name;
	
	public FireMonster(String name) {
		this.name = name;
	}
	
	public String attack(){
		return "Yo soy un monstruo de fuego y me dicen: " + this.name;
	}
	 
	

}
