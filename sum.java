https://www.hackerrank.com/challenges/mini-max-sum

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long s = 0;
        long  a1[] = new long[5];
        a1[0] = a; a1[1] = b; a1[2] = c;
        a1[3] = d;
        a1[4] = e;
       // long s =0;
        for(int i= 0;i < 5; i++)
            s += a1[i];
        long min =Integer.MAX_VALUE ;
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++)
            {
             if(min > a1[i])
                 min = a1[i];
             if(max < a1[i])
                 max = a1[i];
            
        }
        System.out.print((s-max)+" "+(s-min));
    }
}
