https://www.hackerrank.com/challenges/designer-pdf-viewer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int val = 0;
        for(int i = 0; i< word.length(); i++)
            {
               if(val< h[(word.charAt(i) - 'a')])
                   val = h[(word.charAt(i) - 'a')];
         }
        System.out.print(val* word.length());
    }
}
