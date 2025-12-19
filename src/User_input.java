import java.util.Scanner;
public class User_input {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your age is: "+age);
        System.out.println(name);
        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your gpa is: "+gpa);
        System.out.print("Are you student? (True/False) ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) System.out.println("Student!!");
        else System.out.println("MF, get lost bitch");

        scanner.close();
    }
}
