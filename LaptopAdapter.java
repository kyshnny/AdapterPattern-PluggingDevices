/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pluggingdevices;

/**
 *
 * @author DELL
 */
public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;
    
    public LaptopAdapter(Laptop laptop){
        
        this.laptop = laptop;
        
    }
    
    @Override
    public void plugIn(){
        
        laptop.charge();
        
    }
    
}
