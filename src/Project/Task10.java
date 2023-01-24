package Project;

public class Task10 {
    //  10)Write a java program to find the second largest number in the array?
    public static void main(String[] args) {

        int LargestNumber = 0;
        int SecondLargest = 0;

        int[] numbers = {1, 8, 3, 13, 74};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > LargestNumber) {
                SecondLargest = LargestNumber;
                LargestNumber = numbers[i];

            } else if (numbers[i] > SecondLargest) {
                SecondLargest = numbers[i];
            }
        }
        System.out.println("The 2nd Highest Number is "+SecondLargest);
    }
}
