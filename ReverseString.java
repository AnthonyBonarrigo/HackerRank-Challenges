import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

      //Stacks though
        char[] arr = A.toCharArray();
        String B = "";
        for(int i = arr.length - 1; i >= 0; i--){
            B += arr[i];
        }
        if(A.equals(B))
            System.out.print("Yes");
        else
            System.out.print("No");
        
        
    }
}
