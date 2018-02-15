package com.it;

public class Humane {
	private Person person;

	public Person getPerson() {
		System.out.println("GETPerson()");
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
