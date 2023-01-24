package Project;

public class Task3 {
    //  3) Create a 2D array of integer values. Print the sum of all numbers.
    public static void main(String[] args) {
        int sum=0;
        int[][] numbers={{1,5,2},
                          {3,7,8},};
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j< numbers[i].length;j++){
                sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
