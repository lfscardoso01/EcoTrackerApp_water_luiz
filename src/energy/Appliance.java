/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package energy;

/**
 *
 * @author paulo
 */
public class Appliance implements EnergyCalculable{
    private String name;
    private double powerWatts;
    private double hoursPerDay;

    public Appliance(String name, double powerWatts, double hoursPerDay) {
        this.name = name;
        this.powerWatts = powerWatts;
        this.hoursPerDay = hoursPerDay;
    }

    public String getName() {
        return name;
    }

    public double getPowerWatts() {
        return powerWatts;
    }

    public double getHoursPerDay() {
        return hoursPerDay;
    }
    @Override
    public double calculateDailyConsumption(){
       return(powerWatts * hoursPerDay)/1000.0;
       }
            
    
    
}
