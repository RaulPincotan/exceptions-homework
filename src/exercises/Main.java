package exercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DayPlanner dayPlanner = new DayPlanner(List.of(new DaySchedule(Day.MONDAY, new ArrayList<>()),
                new DaySchedule(Day.TUESDAY, new ArrayList<>()),
                new DaySchedule(Day.WEDNESDAY, null),
                new DaySchedule(Day.THURSDAY, new ArrayList<>()),
                new DaySchedule(Day.FRIDAY, new ArrayList<>()),
                new DaySchedule(Day.SATURDAY, new ArrayList<>()),
                new DaySchedule(Day.SUNDAY, new ArrayList<>())
        ));

        dayPlanner.addActivity(Day.MONDAY, "java");
        dayPlanner.addActivity(Day.MONDAY, "work");
        dayPlanner.addActivity(Day.MONDAY, "film");
        dayPlanner.addActivity(Day.MONDAY, "fasttrackit");
        dayPlanner.addActivity(Day.MONDAY, "sleep");
        dayPlanner.addActivity(Day.THURSDAY, "film");
        dayPlanner.addActivity(Day.THURSDAY, "fasttrrackit");
        dayPlanner.addActivity(Day.FRIDAY, "university");
        dayPlanner.addActivity(Day.FRIDAY, "work");
        dayPlanner.addActivity(Day.SATURDAY, "work");
        dayPlanner.addActivity(Day.SUNDAY, "work");
        System.out.println(dayPlanner.getDaySchedules());
        System.out.println();

        try {
            dayPlanner.addActivity(Day.MONDAY, null);
        } catch (NoActivityException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        System.out.println();
        dayPlanner.removeActivity(Day.MONDAY, "work");
        System.out.println(dayPlanner.getDaySchedules());

        //dayPlanner.printPlanner();
        System.out.println();

        try {
            dayPlanner.removeActivity(Day.MONDAY, "eat pizza");
        } catch (NoActivityException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(dayPlanner.getActivities(Day.MONDAY));

        System.out.println();


        dayPlanner.addActivity(Day.TUESDAY, "eat");
        dayPlanner.addActivity(Day.TUESDAY, "sleep");
        dayPlanner.addActivity(Day.TUESDAY, "repeat");

        System.out.println(dayPlanner.getDaySchedules());

        try {
            System.out.println(dayPlanner.endPlanning(Day.TUESDAY));
            System.out.println(dayPlanner.endPlanning(Day.WEDNESDAY));
        } catch (NoActivityForDayException e) {
            System.out.println(e.getMessage());
        }


    }
}
