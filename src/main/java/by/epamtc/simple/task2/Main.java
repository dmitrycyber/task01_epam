package by.epamtc.simple.task2;

public class Main {
    public static void main(String[] args) {
        int dayNumber = 234;
        if (dayNumber > 0 || dayNumber <= 365) {
            System.out.println(calculateDateByDayNumberWithArray(dayNumber));
            System.out.println(calculateDateByDayNumberWithSwitch(dayNumber));
        }
    }

    private static CustomDate calculateDateByDayNumberWithSwitch(int dayNumber) {
        int month = 0;
        int day = 0;
        int tempMonth = 1;
        int passedDays = getCountOfDaysInMonth(tempMonth);

        while (true) {
            if (dayNumber <= passedDays) {
                month = tempMonth;
                day = dayNumber - (passedDays - getCountOfDaysInMonth(tempMonth));
                break;
            }
            tempMonth++;
            passedDays += getCountOfDaysInMonth(tempMonth);
        }
        return new CustomDate(month, day);
    }

    private static int getCountOfDaysInMonth(int month) {
        int days = 0;
        switch (month) {
            case 2:
                return 28;
            case 1:
            case 3:
            case 5:
            case 8:
            case 7:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return days;
    }

    private static CustomDate calculateDateByDayNumberWithArray(int dayNumber) {
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
