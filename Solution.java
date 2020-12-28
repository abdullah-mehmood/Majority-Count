import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
        }
        
        
            int l = 0;
            int r = n-1;
            
            int[] lookup = new int[n+1];
            Arrays.fill(lookup,-1);
            int val = 0;
            val =  majorityCount(n, arr, l, r, lookup);
            if(val == 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");  
            }
            

        
       
    }
    
    public static int majorityCount(int n, int arr[], int l, int r, int[] lookup){
      
      
        int m = (l+(r-1))/2;
        if(l==r){
            return arr[l];
        }else{
         
             int x = majorityCount(n, arr, l, m,lookup);
             int y = majorityCount(n, arr, m+1, r,lookup);
            //  System.out.println(x+":"+y);
             if((x == 0) && (y == 0)){
                  return 0;
             }else if(x == 0 && y !=0){
                 return y;
             }else if(x != 0 && y ==0){
                 return x;
             }else if(x != y){
                 return 0;
             }else{
                 return x;
             }
             
            
        }
       
      
       
    }
}
