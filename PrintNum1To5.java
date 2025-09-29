// Print the number from 1 to 5

public class PrintNum1To5{
    public static void main(String[]args){
        PrintNum(5);
    }
    public static void PrintNum(int n){
        if(n==0){
            return;
        }
        PrintNum(n-1);
        System.out.println(n);
    }
}


