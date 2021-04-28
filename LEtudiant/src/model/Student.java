/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author titou
 */
public class Student extends Person {
    
    private int points;
    private Major major;
    
    public Student(int id, String name, String forname, String password, String email, Major major) {
        super(id, name, forname, password, email);
        this.points = 0;
        this.major = major;
    }

    public Student(int id, String name, String forname, String password, String email, Major major, int points) {
        super(id, name, forname, password, email);
        this.points = points;
        this.major = major;
    }
    
}
