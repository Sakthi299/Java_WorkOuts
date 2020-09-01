public class NewClass {
    public static void main(String[] args)
    {
        int a[][] = new int[4][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];
        
        int c;
        for(int i=0; i<a.length; i++)
        {
            c = 1;
            for(int k=0; k<a.length-a[i].length; k++)
                    System.out.print("  ");
            for(int j=0; j<a[i].length;j++,c++)
            {
                a[i][j] = c;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
