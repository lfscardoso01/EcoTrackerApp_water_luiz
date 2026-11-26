/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package energy;

/**
 *
 * @author paulo
 */
public class HeatingAppliance extends Appliance{
    
    private double heatingProportion;
      

public HeatingAppliance(String name,double powerWatts,double hoursPerDay,double heatingProportion){
    super(name,powerWatts,hoursPerDay);
    this.heatingProportion = heatingProportion;
}    

    public double getHeatingProportion() {
        return heatingProportion;
    }
   @Override
   public double calculateDailyConsumption(){
        return super.calculateDailyConsumption() * heatingProportion;
    }
 
}
