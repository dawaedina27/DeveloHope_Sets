import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> daysOfTheWeekHS = new HashSet<String>();
        daysOfTheWeekHS.add("Monday");
        daysOfTheWeekHS.add("Tuesday");
        daysOfTheWeekHS.add("Wednesday");
        daysOfTheWeekHS.add("Thursday");
        daysOfTheWeekHS.add("Friday");
        daysOfTheWeekHS.add("Saturday");
        daysOfTheWeekHS.add("Sunday");

        System.out.println("Days of the week" + daysOfTheWeekHS);

        Set<String> daysOfTheWeekLHS = new HashSet<String>();
        daysOfTheWeekLHS.add("Monday");
        daysOfTheWeekLHS.add("Tuesday");
        daysOfTheWeekLHS.add("Wednesday");
        daysOfTheWeekLHS.add("Thursday");
        daysOfTheWeekLHS.add("Friday");
        daysOfTheWeekLHS.add("Saturday");
        daysOfTheWeekLHS.add("Sunday");

        System.out.println("(LinkedHashSet) Days of the week" + daysOfTheWeekLHS);

        boolean areEqual = daysOfTheWeekHS.equals(daysOfTheWeekLHS);

        System.out.println("Are the two sets equal? " + areEqual);
    }
}