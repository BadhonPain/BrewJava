import java.util.Scanner;

public class Substring_methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String userName;
        String domain;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        if (email.contains("@")) {
            userName = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@') + 1);
            System.out.println("Your username is: " + userName);
            System.out.println("Your domain name is: " + domain);
        } else System.out.println("Invalid email !!");


        scanner.close();
    }
}
