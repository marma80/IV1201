/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group17.recsystem.controller;

import com.group17.recsystem.model.Person;
import com.group17.recsystem.model.PersonDTO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pmmacaya
 */
@Stateless
public class Controller {

    @PersistenceContext(unitName = "applicationPU")
    private EntityManager em;
   
    /**
     * Creates a new account with the specified data.
     *
     * @param name
     * @param surname
     * @param email
     * @param username Holder's username
     * @param password Holder's password
     */
    public void createPerson(String username, String email, String name, String password, String surname)
    {
        PersonDTO person = new Person(username, email, name, password, surname);
        em.persist(person);
    }
    
    /**
     * Search for the specified account.
     * 
     * @param username The account username of the searched account.
     * @return The account if it was found.
     */
    public Person getPerson(String username){
        try
        { 
            Person account = em.find(Person.class, username);
            return account;
        }
        catch (Exception e)
        {
            return null;
        }       
    }
}
