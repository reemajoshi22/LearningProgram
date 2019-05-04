package com.example.learning;

public class Castingexample {
	public static void main(String[] args) {
		/*AnimalParent animalParent=new AnimalParent();
		DogChild child1=( DogChild)animalParent;*/ // this will give class cast exception because we are converting parent to child
		
		DogChild childClass=new DogChild();
		//AnimalParent  animalParent=(AnimalParent)childClass; //cannot cast from child class to parent
		childClass.makeNoise();// second line for casting is not required as it already contains method
		
		DogChild childClass2=new DogChild();
		AnimalParent  animalParent2=childClass2; // directly doing cast
		animalParent2.makeNoise();
		
		
		
		AnimalParent[] a = { new AnimalParent(), new DogChild(), new AnimalParent() };
		for (AnimalParent animal : a) {
			animal.makeNoise();
			if (animal instanceof DogChild) {
				//animal.playDead(); // try to do a Dog behavior? // compilation fails so we do downcasting
				DogChild child=(DogChild)animal;
				child.playDead();
			}
		}
	}
}

class AnimalParent {
	void makeNoise() {
		System.out.println("generic noise");
	}
}

class DogChild extends AnimalParent {
	void makeNoise() {
		System.out.println("bark");
	}

	void playDead() {
		System.out.println("roll over");
	}
}
