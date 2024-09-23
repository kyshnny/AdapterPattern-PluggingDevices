/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pluggingdevices;

/**
 *
 * @author DELL
 */
public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;
    
    public RefrigeratorAdapter(Refrigerator refrigerator){
        
        this.refrigerator = refrigerator;
        
    }
    
    @Override
    public void plugIn(){
        
        refrigerator.startCooling();
        
    }
    
}
