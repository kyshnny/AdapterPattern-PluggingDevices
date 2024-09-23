/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pluggingdevices;

/**
 *
 * @author DELL
 */
public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger smartphoneCharger;
    
    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger){
        
        this.smartphoneCharger = smartphoneCharger;
        
    }
    
    @Override
    public void plugIn(){
        
        smartphoneCharger.chargePhone();
        
    }
    
}
