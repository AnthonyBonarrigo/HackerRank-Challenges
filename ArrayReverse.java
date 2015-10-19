import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayReverse{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
           Input format: The first line of input contains N where N is the number of integers
           The second line contains N integers                                              */
        Scanner input = new Scanner(System.in);
        int numOfTerms = input.nextInt();
        int[] array = new int[numOfTerms];
        
        for(int x = 0; x < numOfTerms; x++){
            array[x] = input.nextInt();
        }
        
        for(int i = numOfTerms - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
