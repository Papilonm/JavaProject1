package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    //2)Using Scanner create an array of countries. When an array is created, retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three countries");
        //USE: COLOMBIA,PERU,VENEZUELA in any order.
        String[] country = new String[3];

        country[0] = scan.nextLine();
        country[1] = scan.nextLine();
        country[2] = scan.nextLine();
        System.out.println(Arrays.toString(country));


        for (int i = 0; i < country.length; i++) {
            if (country[i].equalsIgnoreCase("Peru")) {
                System.out.println("The capital of Peru is Lima");
            } else if (country[i].equalsIgnoreCase("Colombia")) {
                System.out.println("The capital of Colombia is Bogota");
            } else if (country[i].equalsIgnoreCase("Venezuela")) {
                System.out.println("The capital of Venezuela is Caracas");
            }


        }
    }
}