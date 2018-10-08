/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.jsf;

/**
 *
 * @author musthafa
 */
public class Login {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    private String message="Hello World!";
    public String login(){
    
        System.out.println("login");
        return "home";
    }
}
