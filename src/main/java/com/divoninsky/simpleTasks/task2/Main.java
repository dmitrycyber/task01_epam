package com.divoninsky.simpleTasks.task2;

public class Main {
    public static void main(String[] args) {
        int dayNumber = 366;
        try {
            System.out.println(calculateDateByDayNumber(dayNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static CustomDate calculateDateByDayNumber(int dayNumber) throws Exception {
        if (dayNumber <= 0 || dayNumber > 365) {
            throw new Exception("Entered not valid day number");
        }
        int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysOfPastMonths = 0;
        int month = 0;
        int day = 0;
        for (int i = 0; i < dayInMonth.length; i++) {
            daysOfPastMonths += dayInMonth[i];
            if (dayNumber <= daysOfPastMonths) {
                month = i + 1;
                day = dayNumber - (daysOfPastMonths - dayInMonth[i]);
                break;
            }
        }
        return new CustomDate(month, day);
    }
}
