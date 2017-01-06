https://www.hackerrank.com/challenges/time-conversion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
     
        
             int n;
     
              n = time.charAt(0)- '0';
              n = n*10+ (time.charAt(1)- '0');
              if(n == 12 )
            {     if(time.charAt(time.length()-2) == 'A')    
                  {           
                        System.out.print("00");
                        System.out.print(time.substring(2,time.length()-2));
                  }
                  else
                      System.out.print(time.substring(0,time.length()-2)); 
            }
             else if(time.charAt(time.length()-2) == 'P')
                 { 
                      n+=12;
                      System.out.print(n);
                      System.out.print(time.substring(2,time.length()-2));
                  }
           else
                 System.out.print(time.substring(0,time.length()-2)); 
    
    
    
    }
}
