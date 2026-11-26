/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package water;

/**
 * Represents a water consumption record.
 * student Luiz Cardoso
 * @author lfscardoso
 */
public class WaterActivity {
    
     private int id;
    private String date;
    private double duration;
    private double volume;

    public WaterActivity(int id, String date, double duration, double volume) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getDuration() {
        return duration;
    }

    public double getVolume() {
        return volume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public String displayInfo(){
        return "ID"+id+ 
                "\nDate: " +date+
                 "\nDuration: " +duration+ " minutes" +
                "\nWater volume: " +volume+ " litres";
    }
    

   
}
