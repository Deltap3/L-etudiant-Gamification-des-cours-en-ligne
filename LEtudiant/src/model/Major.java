/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author titou
 */
public class Major {
    
    private int id;
    private String name;
    private ArrayList<Person> persons;
    private ArrayList<Lesson> lessons;
    private ArrayList<Award> awards;
    
    public Major(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Major(int id, String name, ArrayList<Person> persons, ArrayList<Lesson> lessons, ArrayList<Award> awards) {
        this.id = id;
        this.name = name;
        this.persons = persons;
        this.lessons = lessons;
        this.awards = awards;
    }
    
}
