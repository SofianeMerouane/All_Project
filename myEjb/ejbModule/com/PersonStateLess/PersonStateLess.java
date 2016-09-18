package com.PersonStateLess;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import myEjb.metier.Person;

/**
 * Session Bean implementation class PersonStateLess
 */
@Stateless
@LocalBean
public class PersonStateLess implements PersonStateLessRemote, PersonStateLessLocal {

    /**
     * Default constructor. 
     */
    public PersonStateLess() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		
	}

}
