import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**Finds the the largest sum of the "hourglasses" in a 2D array
*   @author AnthonyBonarrigo 
*/
public class Solution {

    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[][] a = new int[6][6];
		
		for(int i = 0; i < 6; i++){
			for(int x = 0; x < 6; x++){
				a[i][x] = input.nextInt();
			}
		}
		
		int largestSum = 0;
		int currentSum = 0;
		
		//collect and sum hourglasses, find max sum
		for(int i = 0; i < 4; i++){
			for(int x = 0; x < 4; x++){
				currentSum = a[i][x] + a[i][x+1] + a[i][x+2] +
						     a[i+1][x+1] + a[i+2][x] + a[i+2][x+1] +
							 a[i+2][x+2];
				if(currentSum > largestSum){
				largestSum = currentSum;
				currentSum = 0;
				}
			}
		}
		
		System.out.print(largestSum);
	}
}
