/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package water;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
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
    
    // Calculates water consumption and emissions for a date range.
public String generateReport(String startDate, String endDate) {

    DateTimeFormatter format = DateTimeFormatter
            .ofPattern("dd-MM-uuuu")
            .withResolverStyle(ResolverStyle.STRICT);

    LocalDate start = LocalDate.parse(startDate.trim(), format);
    LocalDate end = LocalDate.parse(endDate.trim(), format);

    if (end.isBefore(start)) {
        throw new IllegalArgumentException(
                "End date cannot be before start date.");
    }

    double totalVolume = 0;
    double totalEmissions = 0;
    int count = 0;

    for (WaterActivity activity : activities) {
        LocalDate date = LocalDate.parse(activity.getDate(), format);

        // Includes records on the start and end dates.
        if (!date.isBefore(start) && !date.isAfter(end)) {
            totalVolume += activity.getVolume();
            count++;

            // Only hot water records have heating emissions.
            if (activity instanceof HotWaterActivity) {
                HotWaterActivity hotWater = (HotWaterActivity) activity;
                totalEmissions += hotWater.calculateCarbonEmissions();
            }
        }
    }

    return "Report period: " + startDate + " to " + endDate
            + "\nNumber of records: " + count
            + "\nTotal water consumption: " + totalVolume + " litres"
            + "\nEstimated heating emissions: "
            + totalEmissions + " kg CO2e";
}
}
