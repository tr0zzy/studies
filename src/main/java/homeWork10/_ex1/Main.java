package homeWork10._ex1;

public class Main {
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " — выходной");
                    break;
                default:
                    System.out.println(day + " — рабочий день");
            }
        }
    }
}
