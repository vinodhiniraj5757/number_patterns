
public class pattern8 {
    public static void main(String[]args)
    {

        for(int i=1;i<=5;i++)
        {
            int c=1;
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
               
            }
            for (int k = 1; k <= (5- i); k++) {
                System.out.print("  ");
            }
           
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            int b=1;
            System.out.print(" ");
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(b);
                b++;
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(6-(j+i));
                
            }
            System.out.println();
        }
    }
    
}
