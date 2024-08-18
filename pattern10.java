public class pattern10 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            int c=(2*i)-2;
            
            for(int j=1;j<=2*i-1;j++)
            {
                
                if(i>=j)
                { 
                    System.out.print(a++ +" ");        
                }
                else{
                    
                    System.out.print(c-- +" ");
                }      
            }

            System.out.println();
            a=i+1;  
        }
    }
    
}
