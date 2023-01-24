package Project;

import java.util.Scanner;

public class Task1 {

    //1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[] values=new int[5];
        System.out.println("Please enter 5 numbers");

        values[0]= scan.nextInt();
        values[1]=scan.nextInt();
        values[2]=scan.nextInt();
        values[3]=scan.nextInt();
        values[4]=scan.nextInt();
        int sum=0;


        for (int i=0;i<values.length;i++){
            sum=sum+values[i];


        }
        System.out.println("The sum of all values is "+sum);
    }
}
