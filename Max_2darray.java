import java.util.*;
public class Max_2darray{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter integers");
        int n=scan.nextInt();
        int max=0;
        int array[][]= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j]= scan.nextInt();
                if(max<array[i][j]){
                    max= array[i][j];
                }
            }
        }              
            System.out.println("Maximum number in the array is "+ max);
    }
}
