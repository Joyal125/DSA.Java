//Q-7 Search the element in the array

public class Searching{
    public static void main(String[]args){
        int[] arr = {23,12,34,56,76,87};
        int Target = 18;
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == Target){
                flag = true;
                break;
            }

        }
        if(flag == true){
            System.out.println("The Target is exist");
        }
        else{
            System.out.println("The Target is not exist");
        }
    }
}
