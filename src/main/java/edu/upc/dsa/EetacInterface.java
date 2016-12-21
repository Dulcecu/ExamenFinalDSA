package edu.upc.dsa;

/**
 * Created by Turpitude on 21/12/2016.
 */

public interface EetacInterface {

    String getEtakemonInJSON(String name);
    String newEtakemon( String name, Etakemon etk);
    String Login(User user);
    String Register(User user);

}
