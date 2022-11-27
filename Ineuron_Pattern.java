public class Ineuron_Pattern
{
    public static void main(String[] args)
    {
        int n = 5;
        int i , j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)//I
            {
                if(i==0 || j== (n-1)/2 || i == n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            for(j=0;j<n;j++)//N
            {
                if(j==0 || j==n-1 || j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            for(j=0;j<n;j++)//E
            {
                if(i==0 || j== 0 || i== (n-1)/2 || i == n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            for(j=0;j<n;j++)//U
            {
                if( (j==0 && i< n-1 ) || (j== n-1 && i< n-1) || (i== n-1 && j< n-1 && j>0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            for(j=0;j<n;j++)//R
            {
                if(j==0 || (j==i && j>=(n-1)/2) || (i==0 && j>0 && j<n-1)||(i==(n-1)/2 && j<n-1) || (j==n-1 && i>0 && i<(n-1)/2))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            for(j=0;j<n;j++)//O
            {
                if( (j==0 && i>0 && i< n-1 ) || (j== n-1 && i>0 && i< n-1) || (i== n-1 && j< n-1 && j>0) || (i==0 && j!=0 && j!=n-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            for(j=0;j<n;j++)//N
            {
                if(j==0 || j==n-1 || j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.print(" ");
            System.out.println();
        }
    }
}
