/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package water;
import java.util.ArrayList;
/**
 *
 * @author lfscardoso
 */
public class WaterActivityManager {
    
    private ArrayList<WaterActivity> activities;

    public WaterActivityManager() {
        activities = new ArrayList<>();
    }

    // Adds a water activity to the list.
    public void addActivity(WaterActivity activity) {
        activities.add(activity);
    }
    
    public String displayActivities(){
        
        if (activities.isEmpty()) {
        return "No water activities recorded.";
    }
       String result = "";
       
       for (WaterActivity activity : activities) {
        result += activity.displayInfo() +"\n";
    }
       return result;
    }
    
  
}
