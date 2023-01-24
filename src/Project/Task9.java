package Project;

public class Task9 {
    //  9)Maximum and minimum number in the array?\
    public static void main(String[] args) {
        int[] numbers={5,2,4,8};
        int minimum=numbers[0];
        int maximum=numbers[0];

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]< minimum){
                minimum=numbers[i];
            }
            if (numbers[i]> maximum){
                maximum=numbers[i];

            }
        }
        System.out.println("The minimum number is "+minimum);
        System.out.println("The maximum number is "+maximum);
    }
}
