package nc;

public class Town implements City{ // This class implements the city interface. We'll do some things a little differently than we did for the cities.
	String name, population;
	
	Town(String name, String population) { // Once again, a constructor
		this.name = name;
		this.population = population;
	}
	public void parade() { // Small towns are less likely to spend on fireworks. In this example, the residents just use sparklers (lol)
		System.out.println(this.name + ": This is a small town. Better grab a couple of sparklers!");
	}
	
	public void vote(String party) { // A small town is less prone to corruption, so the election is more of a success.
		System.out.println(this.name + ": The people have chosen the " + party + " party to win!");
	}
}
