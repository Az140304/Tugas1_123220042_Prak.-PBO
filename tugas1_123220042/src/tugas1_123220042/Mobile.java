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
public class Mobile extends BarangElektronik {
    
    Mobile (){
        status = false;
        nama = "HP";
        
    }
    
    void buatPanggilan(){
        if (status == true){
            System.out.println("Sedang membuat panggilan");
        } else {
            System.out.println("HP tidak hidup, tidak bisa membuat panggilan");
        }
    }
    
    
    
                                                                               
}
