
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        
        System.out.println("Welcome to the Celsius-Fahrenheit Converter");
        
        System.out.println("Please enter the unit you have (Celsius or Fahrenheit):");
        String type = scanner.nextLine();
        
        System.out.println("Please enter the value of the selected unit:");
        double x = scanner.nextDouble();
        
        if ("Celsius".equalsIgnoreCase(type)) {
            celsius = x;
            System.out.println("Your temperature is " + ((celsius * 9.0 / 5) + 32) + " Fahrenheit");
        } else if ("Fahrenheit".equalsIgnoreCase(type)) {
            fahrenheit = x;
            System.out.println("Your temperature is " + ((fahrenheit - 32) * (5.0 / 9)) + " Celsius");
        } else {
            System.out.println("You made a mistake. Please enter 'Celsius' or 'Fahrenheit'.");
        }
    }
}

