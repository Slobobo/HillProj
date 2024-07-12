package com.gmail.slobodiyan.task15;

public class WeeklyAdvise implements Advisor {

    @Override
    public void advice(Day day) {
        switch (day) {
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
                System.out.println("Please focus on your priorities");
                break;
            case Friday:
                System.out.println("Happy Friday");
                break;
            case Saturday:
            case Sunday:
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
