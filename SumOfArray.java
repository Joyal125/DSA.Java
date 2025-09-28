//Q-2 Print the sum of the element in array
public class SumOfArray {
    public static void main (String[]args){
int[] arr = {12,34,43,56,78};
int sum =0;
for(int i=0; i<arr.length; i++){
    sum += arr[i];
}
System.out.print(sum);
    }
}
