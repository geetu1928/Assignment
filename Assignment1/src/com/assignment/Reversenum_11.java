package com.assignment;
public class Reversenum_11{
    public static void Reverse(int num)
   {

        if (num < 10) {
              System.out.println(num);
              return;
       }
       else {
              System.out.print(num % 10);
              Reverse(num / 10);
       }
    }
    public static void main(String args[])
    { 
       int num = 98765;
       System.out.print("Reversed Number: ");
       Reverse(num);
}
}