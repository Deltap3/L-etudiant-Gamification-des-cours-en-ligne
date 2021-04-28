/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letudiant.model;

import java.util.HashMap;

/**
 *
 * @author titou
 */
public class Quiz {
    
    private Teacher teacher;
    private HashMap<String, String> qa;

    public Quiz(Teacher teacher, HashMap<String, String> qa) {
        this.teacher = teacher;
        this.qa = qa;
    }
    
}
