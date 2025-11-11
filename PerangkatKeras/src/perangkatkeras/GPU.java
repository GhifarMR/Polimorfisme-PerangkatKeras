/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perangkatkeras;

/**
 *
 * @author 62852
 */
public class GPU extends PerangkatKeras{
    public int cudaCores;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("cudaCores : " + cudaCores + " inti CUDA");
    }
}
