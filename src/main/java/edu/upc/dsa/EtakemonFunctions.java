package edu.upc.dsa;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Turpitude on 21/12/2016.
 */

public class EtakemonFunctions implements EetacInterface {


    private HashMap<String,User> listUser;
    private static EtakemonFunctions instance;

    public  EtakemonFunctions(){
        listUser = new HashMap<>();
        //CREO UN USUARIO ESTATICO PARA PROBAR ERRORES DE DUPLICACION Y DEMAS
        User  newUser= new User();
        newUser.setName("Espatula");
        newUser.setPassword("Khan");
        List<Etakemon> test= new ArrayList<>();
        Etakemon etk= new Etakemon();
        etk.setName("Dulce");
        etk.setDescription("Dulcisimo");
        test.add(etk);
        Etakemon etk2= new Etakemon();
        etk2.setName("Grig");
        etk2.setDescription("Grigitos");
        test.add(etk2);
        Etakemon etk3= new Etakemon();
        etk3.setName("Lobo");
        etk3.setDescription("Los lobos");
        test.add(etk3);
        newUser.setEtakemons(test);
       listUser.put(newUser.getName(),newUser);
    }
    public  static EtakemonFunctions getInstance(){
        if (instance==null) instance=new EtakemonFunctions();
        return instance;
    }


    @Override
    public String getEtakemonInJSON(String name) {

        try {
            User found = listUser.get(name);
            String json = new Gson().toJson(found.getEtakemons());
            return  json;
        }
        catch (Exception e){
            return "ERROR";
        }

    }

    @Override
    public String newEtakemon(String name, Etakemon etk) {

        try {
            User found = listUser.get(name);
            try {
                List etakemons = found.getEtakemons();
                etakemons.add(etk);
                found.setEtakemons(etakemons);
                return "200";
            } catch (Exception e) {
                List etakemons = new ArrayList();
                etakemons.add(etk);
                found.setEtakemons(etakemons);
                return "200";
            }
        }
        catch (Exception e){
            return "500";
        }

    }

    @Override
    public String Login(User user) {

        try {
            String found = listUser.get(user.getName()).getName();
            return "200";
        }
        catch (Exception e){
            return "500";
        }

    }

    @Override
    public String Register(User user) {

        try {
            String found = listUser.get(user.getName()).getName();
            return "500";


        }catch (Exception e){
            listUser.put(user.getName(), user);
            return "200";
        }

    }
}
