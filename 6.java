import java.util.Scanner;
 
class Ly
{
    public static void main(String[] argus)
    {
        int yr;
 
        Scanner input= new Scanner(System.in);
        System.out.println("enter the year that u wana check:");
        yr= input.nextInt();
        boolean year= (yr%4==0);
 
        System.out.println("leapyear="+year);
    }
}
