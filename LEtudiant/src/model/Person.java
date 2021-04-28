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
public abstract class Person {
    private int id;
    private String name;
    private String forname;
    private String password;
    private String email;

    public Person(int id, String name, String forname, String password, String email) {
        this.id = id;
        this.name = name;
        this.forname = forname;
        this.password = password;
        this.email = email;
    }
}
