package Mypackage;

import java.util.Scanner;

public class Factorial{

    public static void main(String[] strings){
       try (Scanner sc = new Scanner(System.in)) {
        int n= sc.nextInt();
           int ans = fact(n);
           System.out.println(ans);
    }
    }
    
    
    static int fact(int n){
        if(n<=1) return 1;
        else return n*fact(n-1);
    }
}
