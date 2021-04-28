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
public class Award {
    
    private int id;
    private String name;
    private float price;
    private ArrayList<Integer> majors_id;
    
    public Award(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Award(int id, String name, float price, ArrayList<Integer> majors_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.majors_id = majors_id;
    }
    
}
