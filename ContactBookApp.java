import java.util.Scanner;

public class ContactBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();
        char choice;

        do {
            System.out.println("\n(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.print("Enter a command: ");
            choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            switch (choice){
                case 'A':
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactBook.addContact(name, phone, email);
                    break;
                case 'D':
                    System.out.print("Enter name to delete: ");
                    String delName = scanner.nextLine();
                    contactBook.deleteContact(delName);
                    break;
                case 'E':
                    System.out.print("Enter email to search: ");
                    String searchEmail = scanner.nextLine();
                    contactBook.searchByEmail(searchEmail);
                    break;
                case 'P':
                    contactBook.printContacts();
                    break;
                case 'S':
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    contactBook.searchContact(searchName);
                    break;
                case 'Q':
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invaild command, please try again.");
            }
        }while (choice != 'Q');

        scanner.close();
    }
}
