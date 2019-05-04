package com.example.learning;

import java.util.ArrayList;
import java.util.List;

public class FamilyLauncher {
	public static void main(String[] args) {
		List<String> brother=new ArrayList<String>();
		brother.add("ronit");
		brother.add("dennis");
		List<String> sister=new ArrayList<String>();
		brother.add("diksha");
		brother.add("riya");
		Family family1=new Family();
		family1.setBrother(brother);
		family1.setSister(sister);
		family1.setFather("rakesh");
		family1.setMother("sapna");
		
		Family family2=new Family();
		family1.setBrother(brother);
		family1.setSister(sister);
		family1.setFather("arun");
		family1.setMother("meenakshi");
		FamilyPrinter familyPrinter1=new FamilyPrinter();
		FamilyPrinter familyPrinter2=new FamilyPrinter();
		
		familyPrinter1.setFamily(family1);
		familyPrinter2.setFamily(family2);
		familyPrinter1.printFamily(family1);
		familyPrinter2.printFamily(family2);
	}

}
