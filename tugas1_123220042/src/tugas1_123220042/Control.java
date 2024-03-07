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
public class Control {
    
    public static void main(String[] args) {
        
        Mobile mobile = new Mobile();
        Tv tv = new Tv();
        
        BarangElektronik gadget[] = {mobile, tv};
        BarangElektronik user = new BarangElektronik();
   
        
        
        /** Mendaftarkan nama dan password pengguna*/
        user.setUser("Kak Fikri", "imHandsome");
        System.out.println("IOT user");
        System.out.println("=================");
        System.out.println("Username : " + user.getUser());
        System.out.println("Username : " + user.getPassword());
        System.out.println("=================\n");
        
        /** Menggunakan masing2 gadget dalam power off */
        mobile.buatPanggilan();
        tv.gantiSaluran();
        
        System.out.println("\n");
        
        /** Menghidupkan semua barang elektronik */
        for(BarangElektronik g : gadget){
            System.out.println("Menghidupkan " + g.nama);
            g.turnOn();
        }
        
        System.out.println("\n");
        
        
        /** Menggunakan masing2 gadget dalam power on */
        mobile.buatPanggilan();
        tv.gantiSaluran();
        
        System.out.println("\n");
        
        
        /** Mematikan semua gadget */
        for(BarangElektronik g : gadget){
            System.out.println("Mematikan " + g.nama);
            g.turnOff();
        }
    }
    
}
