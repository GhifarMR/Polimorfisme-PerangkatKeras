/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perangkatkeras;

/**
 *
 * @author 62852
 */
public class RAM extends PerangkatKeras{
    public int speed;
    public String type;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("SPEED : " + speed + " MHz");
        System.out.println("TYPE : " + type);
    }
}