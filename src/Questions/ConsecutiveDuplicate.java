package Questions;
import java.util.Scanner;

public class ConsecutiveDuplicate {
//  14) Write a function to check if the given
//      array A has consecutive duplicate elements or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in array: ");
        int N = sc.nextInt();
        int[] A = new int[N];

        System.out.println("Enter array elements: ");

        // inserting array A
        int i = 0;
        while(i<N) {
            A[i] = sc.nextInt();
            i++;
        }

        // Finding process
        int T = A[0];
        for(int j=1;j<A.length;j++){
            if(T==A[j]){
                System.out.println("The Array consist Consecutive Duplicate elements");
                break;
            }
            else if(j == A.length-1){
                System.out.println("The Array does not consist Consecutive Duplicate elements");
            }
            T = A[j];
            
        }
        // two check consecutive duplicate just check index and index+1
            // start from 0 and end before length-1;
            // if array of size 6
            // comparison between   0 and 1
            //                      1 and 2
            //                      2 and 3 
            //                      3 and 4
            //                      4 and 5
            for(int i=0;i<array.length-1;i++){
                if(array[i] == array[i+1]){
                    return true;
                }
    }
}
