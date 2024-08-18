public class pattern5 {
    public static void main(String[] args)
    {
        //int b=1;
        for(int i=1;i<=4;i++)
        {
            int a=1;
            for(int k=1;k<=5-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(i>=j)
                {
                    System.out.print(a++ +" ");
                }
                else{
                    
                    System.out.print(i*2-j+" "); 
                }
            }
            System.out.println();
        }

        for(int i=1;i<=3;i++)
        {
            int a=1;
            for(int k=1;k<=i+1;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=6-(i+i-1);j++)
            {
                if (j <= 3 - i) {
                    System.out.print(a++ + " ");
                } else {
                    System.out.print(a-- + " ");
                }
            }
            System.out.println();
            }
            
        }
    }
    

