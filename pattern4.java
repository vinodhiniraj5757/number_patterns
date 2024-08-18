public class pattern4 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                {
                    System.out.print(a +" ");
                }
                else
                {
                    System.out.print("  ");
                }
               
            }
            System.out.println();
            a++;
        }
    }
    
}
