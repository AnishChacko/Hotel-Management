import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class hotelbooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hotel Booking Management System");
        System.out.println("Please select your preferred choice:");
        System.out.println("1. Register Account");
        System.out.println("2. Book Reservation");
        System.out.println("3. Generate Bill");
        System.out.println("4. Feedback");

        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                registerAccount();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    private static void registerAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating a new account...");
        File folder = new File("user_accounts");// creating new folder
        if (!folder.exists()) {
            folder.mkdir();
        }
        Random random = new Random();
        int randomNumber = random.nextInt(100000); //creating random number for file
        String fileName = "AccountNumber_" + randomNumber + ".json"; //creating json file
        File jsonFile = new File(folder, fileName);
        try {
            System.out.print("Enter firstname: ");
            String firstname = scanner.next();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.next();
            System.out.print("Enter email address: ");
            String email = scanner.next();
            System.out.print("Enter address: ");
            String address = scanner.next();
            FileWriter writer = new FileWriter(jsonFile);//
            writer.write("{\n");
            writer.write("  \"firstname\": \"" + firstname + "\",\n");
            writer.write("  \"phone\": \"" + phoneNumber + "\",\n");
            writer.write("  \"email\": \"" + email + "\",\n");
            writer.write("  \"address\": \"" + address + "\"\n");
            writer.write("}\n");
            writer.close();
            System.out.println("Account registered successfully. Details saved in " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while creating the account: " + e.getMessage());
        }
    }

    private static void bookReservation() {
    }

    private static void generateBill() {

    }

    private static void feedback() {
    }
}
