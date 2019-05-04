package com.example.learning;

import java.util.List;

public class Family {
	private String mother;
	private String father;
	private List<String> brother;
	private List<String> sister;

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public List<String> getBrother() {
		return brother;
	}

	public void setBrother(List<String> brother) {
		this.brother = brother;
	}

	public List<String> getSister() {
		return sister;
	}

	public void setSister(List<String> sister) {
		this.sister = sister;
	}

}
