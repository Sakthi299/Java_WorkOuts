public class JaggedArray {
    public static void main(String[] args)
    {
        int ja[][] = new int[5][];
        ja[0]= new int[5];
        ja[1] = new int[2];
        ja[2] = new int[1];
        ja[3] = new int[4];
        ja[4] = new int[3];

        int c = 1;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<ja[i].length; j++, c++)
                ja[i][j] = c;
        } 
        
        System.out.println("Jagged Array: ");
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<ja[i].length; j++)
                System.out.print(ja[i][j] + " ");
            System.out.println();
        }
    }
    
    
}
