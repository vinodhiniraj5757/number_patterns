public class pattern1{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            int a=1;
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                {

                    System.out.print(a+" ");
                }  
                else
                {
                    System.out.print(i-a+" "); 
                }
                
            }
            System.out.println();
           
        }
    }
}