import java.util.*;
public class ArrayMul {
    
    Scanner ip = new Scanner(System.in);
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int i, j, k, x1, y1, x2, y2, sum;
    
    public void input()
    {
        System.out.println("Enter size of 1st matrix: ");
        x1 = ip.nextInt();
        y1 = ip.nextInt();
        System.out.println("Enter element for 1st matrix: ");
        for(i=0; i<x1; i++)
        {
            System.out.println("Row: "+(i+1));
            for(j=0; j<y1; j++)
            {
                a[i][j] = ip.nextInt();
            }
        }
        
        System.out.println("Enter size of 2nd matrix: ");
        x2 = ip.nextInt();
        y2 = ip.nextInt();
        System.out.println("Enter element for 2nd matrix: ");
        for(i=0; i<x2; i++)
        {
            System.out.println("Row: "+(i+1));
            for(j=0; j<y2; j++)
            {
                b[i][j] = ip.nextInt();
            }
        }
    }
    public void mul()
    {
        if(y1==x2)
        {
            int c[][] = new int[x1][y2];
            for (i = 0; i < x1; i++)
            {
               for (j = 0; j < y2; j++)
               {  
                  for (k = 0; k < x2; k++)
                  {
                     sum = sum + a[i][k]*b[k][j];
                  }

                  c[i][j] = sum;
                  sum = 0;
               }
            }
            System.out.println("Product of the two matrices: ");
            for(i=0; i<x1; i++)
            {
                for(j=0; j<y2; j++)
                    System.out.print(" " + c[i][j] + " ");
                System.out.println();
            }
        }
        else
            System.out.println("Cannot multiply");
    }
    public static void main(String args[])
    {
        ArrayMul obj = new ArrayMul();
        obj.input();
        obj.mul();
    }
}
