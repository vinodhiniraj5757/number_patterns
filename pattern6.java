public class pattern6 {
    public static void main(String[] agrs)
    {
        int a=1;
        
        for(int i=1;i<=5;i++)
        {
            
            for(int k=1;k<=6-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(i>=j)
               
                System.out.print(a-- +" ");
                
                else
                {         
                    System.out.print(((j-i)+1) +" ");  

                }  
            }
            System.out.println();
            a=i+1;
        }
        int b=4;
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=8-(i+i-1);j++)
            {
                if(j<=5-i)
                {
                    System.out.print(b-- +" ");

                }
                else
                {
                    //System.out.print(((i*4)-(2*(i-1)))-(2*i)+" ");
                    System.out.print((j-4)+i +" ");

                }
                
            }
            System.out.println();
            b=4-i;
        }
    }
    
}
