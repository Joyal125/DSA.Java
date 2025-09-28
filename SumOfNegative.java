import java.util.Scanner;

// Q-1 Print the sum of all the negative number in array
public class SumOfNegative {
    public static void main (String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the element in the array:");
for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
}
for(int i =0; i<n; i++){
    if(arr[i]<0){
        System.out.print(arr[i]);
    }
}
    }
}
