// Brady Scaggari
// March 2 2022
// Lab 8
// Converting Decimal to Binary


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Lab8 {
 
    public static void main(String[] args) {
    
       int N;
       int R;
       List L = new ArrayList();
       
       Scanner input = new Scanner( System.in );
       
       System.out.println(" Enter a number");
       N = input.nextInt();
       
       System.out.println("Decimal: " + N);
          // does the binary conversion by dividing by 2 and keeping remainder 
       while (N > 0)
       {    R = N % 2;
            N = N / 2;
            
            L.add(0,R);
       } 
       
       System.out.print("Binary: ");
       // prints out the binary conversion
       for (int i=0; i < L.size(); i ++)
               System.out.print(L.get(i));
               
       System.out.println();
      
             
       }// of main
} // of class Lab8