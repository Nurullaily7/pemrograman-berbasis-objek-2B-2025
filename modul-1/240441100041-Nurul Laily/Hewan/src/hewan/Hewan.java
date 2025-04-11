/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

class burung {
    String nama;
    String warna;
    String habitat;
    
    // Constructor
    burung(String nama, String warna, String habitat) {
        this.nama = nama;
        this.warna = warna;
        this.habitat = habitat;
    }
    
    // Method
    void suara() {
        System.out.println(nama + " Berkicau: cuitt cuitt cuittt");
    }
    
    void panggil() {
        System.out.println("Burung ini bernama " + nama + ", warna " + warna + ", habitatnya di " + habitat);
    }
}

class domba {
    String nama;
    String jenis;
    int umur;
    
    // Constructor
    domba(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    // Method
    void berbulu() {
        System.out.println(nama + " adalah domba yang berumur " + umur + " tahun, merupakan domba jenis " + jenis);
    }
    
    void makan() {
        System.out.println(nama + " adalah domba yang suka makan rumput");
    }
}

class Kuda {
    String nama;
    int umur;
    String jenis;
    
    // Constructor
    Kuda(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }
    
    // Method
    void berlari() {
        System.out.println(nama + " adalah kuda yang berlari sangat cepat, karena ia jenis " + jenis + " dan sudah berumur " + umur + " tahun");
    }
    
    void suara() {
        System.out.println(nama + " bersuara: Hiiihaaaaa");
    }
}

public class Hewan {
    public static void main(String[] args) {
        String[] namaBurung = {"Ciko", "Beno", "Bobon"};
        String[] namaDomba = {"Beben", "Jun", "Pitro"};
        String[] namaKuda = {"Caiya", "Bento", "Sadow"};
        
        System.out.println("**** Daftar Burung ****");
        for (int i = 0; i < 3; i++) {
            burung br = new burung(namaBurung[i], (i % 2 == 0) ? "biru" : "kuning", "Hutan");
            br.panggil();
            br.suara();
            System.out.println();
        }

        System.out.println("==== Daftar Domba ====");
        for (int i = 0; i < 3; i++) {
            domba dm = new domba(namaDomba[i], (i % 2 == 0) ? "Romney" : "Merino", 2 + i);
            dm.makan();
            dm.berbulu();
            System.out.println();
        }

        System.out.println("==== Daftar Kuda ====");
        for (int i = 0; i < 3; i++) {
            Kuda kd = new Kuda(namaKuda[i], 1 + i, (i % 2 == 0) ? "Kuda Balap" : "Kuda Poni");
            kd.berlari();
            kd.suara();
            System.out.println();
        }
    }
}
