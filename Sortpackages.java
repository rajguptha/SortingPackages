import java.util.*;
import java.util.Scanner;

public class Sortpackages {

    public static String sort(double width, double height, double length, double mass) {
        if (width < 0 || height < 0 || length < 0 || mass < 0) {
            throw new IllegalArgumentException("Values can't be less than 0 or no negative values.");
        }

        double volume = width * height * length;

        
        boolean bulky = volume >= 1000000 || width >= 150 || height >= 150 || length >= 150;

        boolean heavy = mass >= 20;

        if (bulky && heavy) {
            return "REJECTED";
        } else if (bulky || heavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sorting of Packages using Robotic Arm\n");

        while (true) {
            try {
                System.out.print("Enter width in CM  : ");
                String input = sc.nextLine();

                double width  = Double.parseDouble(input);

                System.out.print("Enter height in CM : ");
                double height = Double.parseDouble(sc.nextLine());

                System.out.print("Enter length in CM : ");
                double length = Double.parseDouble(sc.nextLine());

                System.out.print("Enter mass in KG   : ");
                double mass   = Double.parseDouble(sc.nextLine());

                String stack = sort(width, height, length, mass);
                System.out.println("\n The Stack is: " + stack + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }

            System.out.print("If you want to try another Sort? (yes/no): ");
            String again = sc.nextLine();
            if (again.equalsIgnoreCase("no") || again.equalsIgnoreCase("n")) break;
            System.out.println();
        }

        System.out.println("Thank You :) .");
        sc.close();
    }
}