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
public class Tv extends BarangElektronik {
    Tv (){
        status = false;
        nama = "TV";
    };
    
    void gantiSaluran(){
        if (status == true){
            System.out.println("Mengganti channel");
        } else {
            System.out.println("TV tidak hidup, tidak bisa mengganti channel");
        }
    }
    
}
