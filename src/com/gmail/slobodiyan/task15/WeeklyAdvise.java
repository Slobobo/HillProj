package com.gmail.slobodiyan.task15;

public class WeeklyAdvise implements Advisor {

    @Override
    public void advice(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Please focus on your priorities");
                break;
            case FRIDAY:
                System.out.println("Happy Friday");
                break;
            case SATARDAY:
            case SUNDAY:
                System.out.println("Go to the park/swimming pool and have some rest");
                break;
        }
    }

    public static void main(String[] args) {
        Advisor advisor = new WeeklyAdvise();
        for (Day day : Day.values()) {
            System.out.println(day + ": ");
            advisor.advice(day);
        }
    }

}
