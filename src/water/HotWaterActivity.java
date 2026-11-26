/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package water;

/**
 * Represents a hot water consumption record.
 * @author lfscardoso
 */
public class HotWaterActivity extends WaterActivity {
    
    private double initialTemperature;
    private double finalTemperature;
    private double emissionFactor;
    

    public HotWaterActivity(int id, String date,double duration, double volume,double initialTemperature,double finalTemperature,double emissionFactor) {

        super(id, date, duration, volume);

        this.initialTemperature = initialTemperature;
        this.finalTemperature = finalTemperature;
        this.emissionFactor = emissionFactor;
    }

    public void setInitialTemperature(double initialTemperature) {
        this.initialTemperature = initialTemperature;
    }

    public void setFinalTemperature(double finalTemperature) {
        this.finalTemperature = finalTemperature;
    }

    public void setEmissionFactor(double emissionFactor) {
        this.emissionFactor = emissionFactor;
    }

    public double getInitialTemperature() {
        return initialTemperature;
    }

    public double getFinalTemperature() {
        return finalTemperature;
    }

    public double getEmissionFactor() {
        return emissionFactor;
    }
    
    // Estimates the energy needed to heat water, in kWh.
    public double calculateHeatingEnergy() {
    double temperatureDifference =
            finalTemperature - initialTemperature;

    return getVolume() * 4186 * temperatureDifference / 3600000;
}
    // Calculates estimated emissions using the heating energy and emission factor.
    public double calculateCarbonEmissions() {
        return calculateHeatingEnergy() * emissionFactor;
}
    
    
}
