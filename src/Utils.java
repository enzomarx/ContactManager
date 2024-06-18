import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Utils {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDate parseDate(String dateStr) {
        return LocalDate.parse(dateStr, formatter);
    }

    public static String formatDate(LocalDate date) {
        return date.format(formatter);
    }

    public static void mainMenu() {
        System.out.println("1. Add Contact");
        System.out.println("2. Remove Contact");
        System.out.println("3. Edit Contact");
        System.out.println("4. View Contacts");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}
