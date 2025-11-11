/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perangkatkeras;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String[] args) {
        PerangkatKeras p = new PerangkatKeras();
        p = new GPU();
        p = new RAM();
        p = new SSD();
        p = new MOTHERBOARD();
        
        GPU g = new GPU();
        g.nama = "RTX 5070";
        g.merek = "Nvidia";
        g.harga = 10000000;
        g.cudaCores = 6144;
        
        p = g; //Polimorfisme
        p.tampilData(); //VMI
        g.tampilData();
        
        //Heterogeneus Collection
        PerangkatKeras[] arrPK = new PerangkatKeras[4];
        
        RAM r = new RAM();
        r.nama = "Vengeance DDR5";
        r.merek = "Corsair";
        r.harga = 800000;
        r.speed = 7200;
        r.type = "DDR5";

        SSD s = new SSD();
        s.nama = "980 PRO";
        s.merek = "Samsung";
        s.harga = 1500000;
        s.storage = 1000;
        
        MOTHERBOARD m = new MOTHERBOARD();
        m.nama = "b650";
        m.merek = "Asrock";
        m.harga = 2000000;
        m.pcieLane = 32;

        arrPK[0] = g;
        arrPK[1] = r;
        arrPK[2] = s;
        arrPK[3] = m;

        System.out.println("==== DAFTAR PERANGKAT KERAS ====");
        for (PerangkatKeras pk : arrPK) {
            pk.tampilData();
            System.out.println("================================");
        }

        hitungTotalHarga(g);
        hitungTotalHarga(r);
        hitungTotalHarga(s);
        hitungTotalHarga(m);
    }
    
    //Polimorphic Argument
    public static void hitungTotalHarga(PerangkatKeras p) {
        if (p instanceof GPU) {
            GPU gp = (GPU) p;
            System.out.println("Total harga GPU (" + gp.nama + ") = Rp " + gp.harga);
        } else if (p instanceof RAM) {
            RAM ra = (RAM) p;
            System.out.println("Total harga RAM (" + ra.nama + ") = Rp " + ra.harga);
        } else if (p instanceof SSD) {
            SSD ss = (SSD) p;
            System.out.println("Total harga SSD (" + ss.nama + ") = Rp " + ss.harga);
        } else if (p instanceof MOTHERBOARD) {
            MOTHERBOARD mb = (MOTHERBOARD) p;
            System.out.println("Total harga MOTHERBOARD (" + mb.nama + ") = Rp " + mb.harga);
        }
        System.out.println();
    }
    
}
