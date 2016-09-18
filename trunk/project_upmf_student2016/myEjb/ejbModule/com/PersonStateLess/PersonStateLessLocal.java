package com.PersonStateLess;

import javax.ejb.Local;

import myEjb.metier.Person;

@Local
public interface PersonStateLessLocal {
	
	public void addPerson(Person p) ; 

}
