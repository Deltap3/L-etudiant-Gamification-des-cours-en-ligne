/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letudiant.model;

import java.util.ArrayList;

/**
 *
 * @author titou
 */
public class Teacher extends Person {
    
    private ArrayList<Major> majors;
    
    public Teacher(int id, String name, String forname, String password, String email, ArrayList<Major> majors) {
        super(id, name, forname, password, email);
        this.majors = majors;
    }
    
}
