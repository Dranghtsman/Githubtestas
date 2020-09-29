
import java.util.Scanner;
public class BMIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates an object of Scanner
        System.out.println("Enter Your Name ");
        String Name = input.nextLine();// Takes input from the keyboard
        System.out.println("Enter Your Height (Cm)");
        float Height; // declaration
        Height = input.nextFloat();
        System.out.println("Enter Your Weight");
        int Weight;
        Weight = input.nextInt();
        input.close();// Closes the scanner
        float BMI = (Weight * Weight) / Height;

            System.out.println("Name:" + Name + "\nBody Index :" + BMI + "\nHeight :" + Height + "\nWeight (Kg) :" + Weight);
        }
    }

