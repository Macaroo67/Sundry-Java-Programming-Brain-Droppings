/*************************************
** JosephusProblemSimpleSolution.java       
** Author: McMurtrie, David J. 
** © 2018 All rights reserved
**************************************/

import java.util.*;

public class JosephusProblemSimpleSolution{
   public static void main (String[] args){
   
      // input the number of elements, in this case soldiers.
      int numSoldiers;
      String resultBinaryString = "";
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of soldiers: ");
      numSoldiers = scan.nextInt();
      
      // convert the number of soldiers into a binary string
      String binary = Integer.toBinaryString(numSoldiers);
      
      // move the left-most binary unit to the end of the binary string
      // and store the new binary string in "resultBinaryString"
      for(int i = 1; i < binary.length(); i++){
          resultBinaryString += binary.charAt(i);
      }
      resultBinaryString += binary.charAt(0);
      
      // convert the new binary string into a decimal integer
      int decimalValue = Integer.parseInt(resultBinaryString, 2);
      
      // print the decimal integer to the console. 
      // This is the last soldier standing.
      System.out.print("The last soldier standing will be number: " + decimalValue);   
  }
}