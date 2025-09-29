//Print the number from 5 to 1 using recursion

public class PrintNum5To1{
    public static void main (String[]args){
PrintFun(5);
    }
    public static void PrintFun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintFun(n-1);
    }
}