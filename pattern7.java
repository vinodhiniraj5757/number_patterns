public class pattern7 {
    public static void main(String[] args)
{
    int a=1;
    for(int i=1;i<=5;i++)
    {
        
        for(int k=1;k<=i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=6-i;j++)
        {
            System.out.print(a +" ");
            a++;
        }
        System.out.println();
        a=1+i;
    }
    int b=4;
    for(int i=1;i<=4;i++)
    {
        for(int k=1;k<=5-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=1+i;j++)
        {
            System.out.print(b +" ");
            b++;
        }
        System.out.println();
        b=4-i;
    }
}    
}
