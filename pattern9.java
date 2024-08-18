public class pattern9 {
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            int a=1,b=11;
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(a +" ");
                a++;
            }
            for(int j=1;j<=11-i;j++)
            {
                if(b==11)
                {
                    System.out.print("  ");
                }
                b--;
                System.out.print(b +" ");
               
               
                
            }
            System.out.println();
            
        }
    }
    
}
