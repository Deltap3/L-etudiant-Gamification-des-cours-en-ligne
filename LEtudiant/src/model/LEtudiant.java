package model;

import controller.Connexion;

/**
 * @author titou, rathsada
 */
public class LEtudiant {

    public static void main(String[] args) {
        
        try{
        // connect to the database
        Connexion conn = new Connexion();
        conn.closeConn();      
        } catch (ClassNotFoundException e){
            System.out.println("Class not found exception");
        }
        
    }
    
}
