package nc;

public class BigCity implements City { // This class works for cities like Charlotte and Raleigh. We will see that the political system
	// is corrupt (in our hypothetical example) and that they can afford big celebrations
	
	String name, population;
	
	BigCity(String name, String population) { // Constructor method. Sets the name and population of the city
		this.name = name;
		this.population = population;
	}
	
	@Override // We are overriding the parade() method in the City interface
	public void parade() {
		System.out.println(this.name + ": This city will launch fireworks for three days!"); // Example of using object variable this.name
	}
	
	@Override
	public void vote(String party) {
		System.out.println(this.name + ": The " + party + " party would have won the election if not for fraud! Time for reform."); // Similar to
		// above, but this function requires the name of a political party
	}
}