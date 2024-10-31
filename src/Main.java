import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);
        Set<String> weekDaysInOrder = new LinkedHashSet<>();
        weekDaysInOrder.add("Monday");
        weekDaysInOrder.add("Tuesday");
        weekDaysInOrder.add("Wednesday");
        weekDaysInOrder.add("Thursday");
        weekDaysInOrder.add("Friday");
        weekDaysInOrder.add("Saturday");
        weekDaysInOrder.add("Sunday");
        System.out.println(weekDaysInOrder);
        System.out.println("Is the first Set equal to the second one? "+ weekDays.equals(weekDaysInOrder));
    }
}