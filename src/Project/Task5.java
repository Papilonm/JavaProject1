package Project;

public class Task5 {
    //  5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
    public static void main(String[] args) {
        int[][] numbers={{2,7,3},
                         {6,8,1}};
        int sum1=0;
        int sum2=0;
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j< numbers[i].length;j++){
                if (numbers[i][j]%2==0){
                sum1=sum1+numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                    sum2=sum2+numbers[i][j];


                }
            }
        }
        System.out.println("The Addition of Even numbers is "+ sum1);
        System.out.println("The Addition of Odd numbers is "+sum2);
    }
}
