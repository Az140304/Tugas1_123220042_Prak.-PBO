/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_123220042;

/**
 *
 * @author DELL
 */
public class BarangElektronik {
    boolean status;
    String nama;
    private String user, password;
    
    public void setUser (String user, String password){
        this.user = user;
        this.password = password;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    boolean turnOn() {
        status = true;
        return status;
    }
    
    boolean turnOff() {
        status = false;
        return status;
    }

    
}
