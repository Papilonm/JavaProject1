package Project;

public class Task11 {


    //11)Write a program to print out duplicate elements from an Array of Strings?

    public static void main(String[] args) {

        int[] numbers = {1, 5, 2, 4, 5, 7, 7, 8, 4};
        System.out.println("Duplicate elements are:");
        for (int i=0;i<numbers.length;i++){
        for (int j=i+1;j<numbers.length;j++){
            if (numbers[i]==numbers[j]){
                System.out.println(numbers[j]);
            }
            }
        }

    }
}
