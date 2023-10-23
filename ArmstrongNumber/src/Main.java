import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int basNumber = 0;
        int tempNumber = num;
        int basValue;
        int result = 0;
        int basPow;

        while(tempNumber!=0)
        {
            tempNumber = tempNumber/10;
            basNumber++;
        }
        tempNumber=num;
        while(tempNumber!=0)
        {
            basValue = tempNumber%10;
            basPow = 1;
            for(int i=0;i<basNumber;i++)
            {
                basPow = basPow*basValue;
            }
            result = result + basPow;
            tempNumber = tempNumber/10;
        }

        if(result==num)
            System.out.println("The number is an Armstrong number.");
        else
            System.out.println("The number is not an Armstrong number.");
    }
}