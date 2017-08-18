package nc;

public class BigRaceCity extends BigCity { // Unlike the BigCity class, which implements an interface, this class extends an actual class (the
	// BigCity class). Here the parade() method is being overridden, an example of polymorphism.

	BigRaceCity(String name, String population) { // This constructor is required because the parent class has a constructor
		super(name, population); // SImply runs the parent class's constructor with these parameters
	}

	@Override
	public void parade() {
		super.parade(); // Here, we first run the parent class's parade() method
		System.out.println(this.name + ": ...and maybe host a race, too!"); // Now, we essentially add to what has just been done with the super.parade() 
		// method, and we print out another line. (Perhaps Charlotte would throw a race in this hypothetical celebration example.)
	}
}
