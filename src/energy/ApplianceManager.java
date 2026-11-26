/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package energy;

/**
 *
 * @author paulo
 */
import java.util.ArrayList;

public class ApplianceManager {
    private ArrayList<Appliance> appliances;
    

    public ApplianceManager(){
        appliances= new ArrayList<>();
        
}
    public void addAppliance(Appliance appliance){
        appliances.add(appliance);
        
}
    public ArrayList<Appliance> getAllAppliances() {
    return new ArrayList<>(appliances);
}
    public Appliance searchAppliance(String name){
        for (Appliance appliance :appliances){
            if(appliance.getName().equalsIgnoreCase(name)){
                return appliance;
            }
            
        }
        return null;
    }
    public boolean deleteAppliances(String name){
        Appliance appliance = searchAppliance(name);
        
        if(appliance !=null){
            appliances.remove(appliance);
            return true;
        }
        return false;
    }
    
}
