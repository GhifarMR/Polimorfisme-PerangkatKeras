/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perangkatkeras;

/**
 *
 * @author 62852
 */
public class SSD extends PerangkatKeras{
    public int storage;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("STORAGE : " + storage + " GB");
    }
}
