/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group17.recsystem.model;

/**
 * The views read-only view of an Account.
 *
 * @author pmmacaya
 */
public interface PersonDTO {
        
    /**
     * Gets the username of the holder of this Account.
     *
     * @return the username of the holder of this Account.
     */
    public String getUsername();
    
    /**
     * Gets the password of the holder of this Account.
     *
     * @return the password of the holder of this Account.
     */    
    public String getPassword();   
    
}
