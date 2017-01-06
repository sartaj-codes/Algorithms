https://www.hackerrank.com/challenges/plus-minus

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
    
    float  neg= 0, pos = 0, zero = 0;
    for(int i = 0; i<arr.length; i++)
        {
          if(arr[i]< 0)
               neg++;
           else if(arr[i] > 0)
                pos++;
               else
                 zero++;
    }
    System.out.print((pos/n)+"\n"+(neg/n)+"\n"+ (zero/n)); 
    }
}
