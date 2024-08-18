public class pattern3 {
    public static void main(String[] args)
    {
        int a=1,b=4;
         for(int i=1;i<=5;i++)
         {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                System.out.print(a);
            }
            System.out.println();
            a++;
         }
         for(int i=1;i<=4;i++)
         {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=8-(i+(i-1));j++)
            {
                System.out.print(b);
            }
            System.out.println();
            b--;
         }
    }
    
}
