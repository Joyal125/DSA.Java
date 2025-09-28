// Q-6 Multiply the odd index with 2 and add 10 to the even indexes
public class OddAndEven{
    public static void main(String[]args){
        int[] arr = {10,20,30,40,50,60};
        for(int i =0; i<arr.length; i++){
            if(i%2==0){
                arr[i] = arr[i] +10;
            }
            else{
                arr[i] = arr[i] *2;
            }
            System.out.print("Modified array ");
            for(int ele: arr){
                System.out.println(ele+" ");
            }
        }
    }
}
