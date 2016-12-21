package edu.upc.dsa;

import java.util.List;

/**
 * Created by Turpitude on 21/12/2016.
 */

public class User {

    public String name;
    public String password;
    public List<Etakemon> etakemons;


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Etakemon> getEtakemons() {
        return etakemons;
    }

    public void setEtakemons(List<Etakemon> etakemons) {
        this.etakemons = etakemons;
    }
}
