// Ted Birdsell
// 11/26/2018
// This program simulates a magic square using a two dimensional array. The program
// contains a method that accepts a two dimensional array as an argument and determines
// if the array is a Lo Shu Magic Square


import java.util.Scanner;


public class LoShuMagicSquare
{
           
   public static void main(String[] args)
   {     
      boolean isLoShu = false;
      int[][] loShuSquareArray = {{4,9,2}, {3,5,7}, {8,1,6}};
      
      isLoShu = calculateLoShu(loShuSquareArray);
      System.out.println(isLoShu);
                      
   }
   
   public static boolean calculateLoShu(int[][] array)
   {
      boolean isLoShu = false;               // Detemine if magic square
      int r0 = 0;                            // Holds total for row 1
      int r1 = 0;                            // Holds total for row 2
      int r2 = 0;                            // Holds total for row 3
      int c0 = 0;                            // Holds total for column 1
      int c1 = 0;                            // Holds total for column 2
      int c2 = 0;                            // Holds total for column 3
      
      for (int col = 0; col < array[0].length; col++)        
           r0 += array[0][col];
         
           System.out.println("Row total = " + r0);
           
      for (int col = 0; col < array[1].length; col++)        
           r1 += array[1][col];
         
           System.out.println("Row total = " + r1); 
           
      for (int col = 0; col < array[2].length; col++)        
           r2 += array[2][col];
         
           System.out.println("Row total = " + r2); 
           
      for (int row = 0; row < array.length; row++)        
           c0 += array[row][0];
         
           System.out.println("Column total = " + c0);
      
      for (int row = 0; row < array.length; row++)        
           c1 += array[row][1];
         
           System.out.println("Column total = " + c1);
           
      for (int row = 0; row < array.length; row++)        
           c2 += array[row][2];
         
           System.out.println("Column total = " + c2);
           
      return (r0 == r1 && r0 == r2 && r0 == c0 && r0 == c1
          && r0 == c2);
    
          
      
    }
}