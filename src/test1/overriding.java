/*
 * This is an example of runtime polymorphism, in the form of method overriding.
 * 
 * Here, a child class will override the method it inherited from its parent. Thus, the same function, 
 * called describe(), will have two different results depending on which class we use.
 */

package test1; // Package for this IBG Training Test

class Car { // First, create a basic class called "Car"
	public void describe() { // This method describes the object
		System.out.println("This is a car.");
	}
}

class ModelS extends Car { // This is a child of the Car class
	public void describe() { // More specific description this time
		System.out.println("This is a high-end electic vehicle made by Tesla Motors.");
	}
	
	public void race() { // This is a method which is not present in the parent Car class
		System.out.println("This car has instant torque. Vroom vroom.");
	}
}

public class overriding { 
	public static void main(String[] args) { // Let's try it out!
		Car MyCar = new Car(); // Create new Car object called MyCar
		MyCar.describe(); // Let the car describe itself
		
		Car MyNewTesla = new ModelS(); /* Create new ModelS object. It inherits the describe() method,
		but one that has overridden the original Car describe() method. */
		MyNewTesla.describe(); // Let the Model S describe itself
		
		//MyNewTesla.race();
		/* If we were to enable the above line of code, there would be an error. This is because the
		 * MyNewTesla object is of the Car reference type, and the Car class does not have the race()
		 * method. Even though the object is a ModelS object, we can only use the functions specified in
		 * the parent class, because we said that MyNewTesla is of the Car reference type. 
		 */
	}
}