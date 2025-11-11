/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perangkatkeras;

/**
 *
 * @author 62852
 */
public class MOTHERBOARD extends PerangkatKeras{
    public int pcieLane;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("JUMLAH PCIE LANE : " + pcieLane);
    }
}
