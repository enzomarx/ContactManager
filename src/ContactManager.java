import java.time.LocalDate;
import java.util.Scanner;

public class ContactManager {
    private static UserManager userManager = new UserManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        User user = userManager.getUser(username);
        if (user == null) {
            user = new User(username);
            userManager.addUser(user);
        }

        boolean running = true;
        while (running) {
            Utils.mainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addContact(user);
                    break;
                case 2:
                    removeContact(user);
                    break;
                case 3:
                    editContact(user);
                    break;
                case 4:
                    viewContacts(user);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
            userManager.saveUser(user);
        }
    }

    private static void addContact(User user) {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date met (yyyy-MM-dd): ");
        LocalDate dateMet = Utils.parseDate(scanner.nextLine());
        System.out.print("Enter birthday (yyyy-MM-dd): ");
        LocalDate birthday = Utils.parseDate(scanner.nextLine());

        Contact contact = new Contact(name, dateMet, birthday);
        user.addContact(contact);
        System.out.println("Contact added.");
    }

    private static void removeContact(User user) {
        System.out.print("Enter contact name to remove: ");
        String name = scanner.nextLine();
        Contact contact = user.findContactByName(name);
        if (contact != null) {
            user.removeContact(contact);
            System.out.println("Contact removed.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void editContact(User user) {
        System.out.print("Enter contact name to edit: ");
        String name = scanner.nextLine();
        Contact contact = user.findContactByName(name);
        if (contact != null) {
            System.out.print("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new date met (yyyy-MM-dd): ");
            LocalDate dateMet = Utils.parseDate(scanner.nextLine());
            System.out.print("Enter new birthday (yyyy-MM-dd): ");
            LocalDate birthday = Utils.parseDate(scanner.nextLine());

            contact.setName(newName);
            contact.setDateMet(dateMet);
            contact.setBirthday(birthday);
            System.out.println("Contact updated.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void viewContacts(User user) {
        for (Contact contact : user.getContacts()) {
            System.out.println(contact);
        }
    }
}
