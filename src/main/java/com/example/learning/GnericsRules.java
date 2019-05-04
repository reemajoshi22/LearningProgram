package com.example.learning;

import java.util.ArrayList;
import java.util.List;

public class GnericsRules {

	public static void main(String[] args) {
		GnericsRules gnericsRules = new GnericsRules();
		ArrayList<String> strings=new ArrayList<String>();
		ArrayList<Integer> integer=new ArrayList<Integer>();
		ArrayList<Animal> arrayListAnimal = new ArrayList<Animal>();
		ArrayList<Dog> arrayListDog = new ArrayList<Dog>();
		ArrayList<Bird> arrayListBird = new ArrayList<Bird>();
		ArrayList<Object> arrayListObject = new ArrayList<Object>();
		// arrayListAnimal.add(new Animal());//why coz animal is abstract class
		arrayListAnimal.add(new Dog());
		arrayListAnimal.add(new Cat());
		arrayListAnimal.add(new Bird());
		gnericsRules.passAParticular(arrayListAnimal);
		// gnericsRules.passAParticular(arrayListDog);// because arraylist accepts only
		// genric tyoe animal list
		gnericsRules.passAParticularUsingExteds(arrayListAnimal);
		gnericsRules.passAParticularUsingExteds(arrayListDog);// because arraylist accepts anything that extends animal
	//	gnericsRules.passAParticularUsingExteds(arrayListObject);//coz object doesnot extnds animal
		gnericsRules.passAParticularUsingExteds(arrayListBird);//coz object doesnot extnds animal
		
		gnericsRules.passAParticularUsingSuper(arrayListAnimal);
		//gnericsRules.passAParticularUsingSuper(arrayListDog);coz dog is not higher to animal
		//gnericsRules.passAParticularUsingSuper(arrayListBird);
		gnericsRules.passAParticularUsingSuper(arrayListObject);
		
		
		gnericsRules.passAParticularUsingQustionWildCard(arrayListAnimal);
		gnericsRules.passAParticularUsingQustionWildCard(arrayListDog);
		gnericsRules.passAParticularUsingQustionWildCard(arrayListBird);
		gnericsRules.passAParticularUsingQustionWildCard(arrayListObject);
		
		
		gnericsRules.passAParticularUsingQuestionAndExtend(animalList);
		gnericsRules.passAParticularUsingQuestionAndExtend(arrayListDog);
		gnericsRules.passAParticularUsingQuestionAndExtend(arrayListBird);
		gnericsRules.passAParticularUsingQuestionAndExtend(arrayListObject);
		
		
		gnericsRules.stringtype(strings);
		gnericsRules.stringtype(integer);
	}

	private void passAParticular(ArrayList<Animal> animalList) {

		// this method can accept only arraylist which is of type animal but can add
		// anything
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Bird());
		//animalList.add("1");
	}

	private void passAParticularUsingExteds(ArrayList<? extends Animal> animalList) {

		// this method can accept only arraylist which is of type animal but can add
		// anything
		animalList.add(new Dog());
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Bird());
	}
	private void passAParticularUsingSuper(ArrayList<? super Animal> animalList) {

		// this method can accept only arraylist which is of type animal but can add
		// anything
		animalList.add(new Dog());
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Bird());
	}
	private void passAParticularUsingQustionWildCard(ArrayList<?> animalList) {

		// this method can accept only arraylist which is of type animal but can add
		// anything
		animalList.add(new Dog());
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Bird());
	}
	
	private void passAParticularUsingQuestionAndExtend(ArrayList<? extends Animal> animalList) {

		// this method can accept only arraylist which is of type animal but can add
		// anything
		animalList.add(new Dog());
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Bird());
	}

	private void stringtype(List stringList) {

		stringList.add("string");
		stringList.add(1);
	}

}
