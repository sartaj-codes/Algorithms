https://www.hackerrank.com/challenges/diagonal-difference/submissions/code/34972841

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0;i < n; i++)
            { 
               sum1 += a[i][i];
               sum2 += a[i][(n-1)-i];
        }
        System.out.print(Math.abs(sum1-sum2));
        
    }
}
