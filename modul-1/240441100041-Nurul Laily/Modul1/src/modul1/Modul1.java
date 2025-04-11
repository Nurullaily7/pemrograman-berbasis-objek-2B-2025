/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1;

class manusia {
    String nama;
    int umur;
    String alamat;

    //constructure
    manusia (String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    //method
    void berjalan(){
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berjalan ");
    }
    
    void berlari(){
        System.out.println(nama + " " + umur + " tahun " + alamat + " sedang berlari ");
    }
 }
public class Modul1 {
    
    public static void main(String[] args) {
        //object
        manusia manusia1 = new manusia ("Lely", 18, "Sampang");
        manusia manusia2 = new manusia ("Rania", 20, "Bandung");
        manusia manusia3 = new manusia ("Rizky", 19, "Pamekasan");
        manusia manusia4 = new manusia ("asraf", 18, "Gresik");
        manusia manusia5 = new manusia ("Nofita", 21, "Sidoarjo");
        
        //memanggil object dan method
        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();
    }
}
