import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int total=0;
        int num = sc.nextInt();
        for(int i=1;i<num;i++){
            if(num % i==0){
                total=total+i;
            }
        }
        if(total==num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}