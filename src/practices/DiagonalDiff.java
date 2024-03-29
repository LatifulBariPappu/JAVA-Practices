package practices;
import java.io.*;
public class DiagonalDiff {
     
    public static int difference(int arr[][], int n)
    {
        int d1 = 0, d2 = 0;
      
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];
      
                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }
      
        return Math.abs(d1 - d2);
    }
    public static void main(String[] args)
    {
        int n = 3;
          
        int arr[][] =
        {
            {11, 2, 4},
            {4 , 5, 6},
            {10, 8, -12}
        };
      
        System.out.print(difference(arr, n));
        
    }
  }