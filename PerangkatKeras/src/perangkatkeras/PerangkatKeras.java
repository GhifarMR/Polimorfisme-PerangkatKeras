/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perangkatkeras;

/**
 *
 * @author 62852
 */
public class PerangkatKeras {
    public String nama, merek;
    public int harga;
    
    public void tampilData(){
        System.out.println("NAMA : " + nama);
        System.out.println("MEREK : " + merek);
        System.out.println("HARGA : " + harga);
    }
    
    public void run(){
        System.out.println(nama + " BERJALAN..");
    }
}
