public class pattern2 {
    public static void main(String[] args)
    {
        
        for(int i=1;i<=5;i++)
        {
            int a=5;
            System.out.print(" ");
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
    
}
