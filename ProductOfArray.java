//Q-3 Print the product of the array
public class ProductOfArray{
    public static void main (String[]args){
        int[] arr = {12,23,14,56,18};
        int Product = 1;

        for(int i =0; i<arr.length; i++){
            Product *= arr[i];
        }
        System.out.print(Product);
    }
}
