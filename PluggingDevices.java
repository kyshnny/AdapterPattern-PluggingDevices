/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pluggingdevices;

/**
 *
 * @author DELL
 */
public class PluggingDevices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
        
    }
    
}
