/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fixme.recruiter.view;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author clindell
 */
@Named(value = "accountManager") //value = 
@RequestScoped
public class AccountManager {
 
    private String inputName;
    private String inputSurname;
    private String inputSsn;
    private String inputEmail;
    private String inputPassword;

    /**
     * @return the inputName
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * @param inputName the inputName to set
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * @return the inputSurname
     */
    public String getInputSurname() {
        return inputSurname;
    }

    /**
     * @param inputSurname the inputSurname to set
     */
    public void setInputSurname(String inputSurname) {
        this.inputSurname = inputSurname;
    }

    /**
     * @return the inputSsn
     */
    public String getInputSsn() {
        return inputSsn;
    }

    /**
     * @param inputSsn the inputSsn to set
     */
    public void setInputSsn(String inputSsn) {
        this.inputSsn = inputSsn;
    }

    /**
     * @return the inputEmail
     */
    public String getInputEmail() {
        return inputEmail;
    }

    /**
     * @param inputEmail the inputEmail to set
     */
    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    /**
     * @return the inputPassword
     */
    public String getInputPassword() {
        return inputPassword;
    }

    /**
     * @param inputPassword the inputPassword to set
     */
    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    public void doRegister() throws Exception {
        System.out.println("hey ho " + this.inputName);
        //throw new Exception("Now what.");
    }
}
