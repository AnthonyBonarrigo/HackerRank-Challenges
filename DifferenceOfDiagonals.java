import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* Creates a matrix of size N and finds the difference between the sums two main diagonals (Math.abs(a-b))
* @author AnthonyBonarrigo
*/
public class DifferenceOfDiagonals {

    public static void main(String[] args) {
         //Get matrix size and create matrix 
         Scanner input = new Scanner(System.in);
         int matrixSize = input.nextInt();
         int[][] matrix = new int[matrixSize][matrixSize];
        

        //Fill matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        //Sum diagonals
        for (int i = 0; i < matrixSize; i++) {
             sum1 += matrix[i][i];
             sum2 += matrix[i][matrix.length - (i + 1)];
        }
        //Output difference 
        int difference = Math.abs(sum1 - sum2);
        System.out.print(difference);
    }
}
