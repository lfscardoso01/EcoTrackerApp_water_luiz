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
    // Finds a water activity by its ID.
    public WaterActivity searchActivity(int id) {
        for (WaterActivity activity : activities) {
            if (activity.getId() == id) {
                return activity;
        }
    }

        return null;
}
  // Deletes a water activity by its ID.
public boolean deleteActivity(int id) {
    WaterActivity activity = searchActivity(id);

        if (activity != null) {
            activities.remove(activity);
            return true;
    }

        return false;
    }

public static void main(String[] args) {
    WaterActivityManager manager = new WaterActivityManager();

    WaterActivity activity = new WaterActivity(
            1, "26-11-2026", 5, 20
    );

    manager.addActivity(activity);

    // Searches for an existing record.
    WaterActivity found = manager.searchActivity(1);

    if (found != null) {
        System.out.println(found.displayInfo());
    }

    // Searches for a missing record.
    System.out.println(manager.searchActivity(99));

    // Deletes the record, then tries again.
    System.out.println(manager.deleteActivity(1));
    System.out.println(manager.deleteActivity(1));

    System.out.println(manager.displayActivities());
}
}
