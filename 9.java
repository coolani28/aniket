import java.util.Scanner;
class sum{
 
     public static void main(String[] args) 
     { 
        int n,i=1,sum=0; 
        Scanner input=new Scanner(System.in); 
        System.out.print("Enter Number :"); 
        n=input.nextInt(); 
        for (i=0;i<=n;i++)
            { 
                 sum=sum+i; 
                 
            }   
                 System.out.print("Sum of First " + n + " Numbers = "+sum); 
     } 
}