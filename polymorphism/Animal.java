package polymorphism;
//package name polymorphism

public class Animal {
	//Class name Animal
	  public void animalSound() 
	  //Method name animalSound
	  {
	    System.out.println("The animal makes a sound");
		  //Printing statement/syntax
	  }
	}

	class Pig extends Animal {
		//extends keywords (inheritance)
	  public void animalSound() {
		  //Same method name with different class is polymorphism
	    System.out.println("The pig says: wee wee");
		  //Printing Statement/syntax
	  }
	}

	class Dog extends Animal {
		//Different class extends with base class
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
		  //Printing statement/syntax
	  }
	}
