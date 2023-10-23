import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter heat: ");
        int heat = sc.nextInt();
        if(heat<5){
            System.out.println("go to skiing");
        }
        else if(heat>=5 && heat<=25){
            if(heat<=15){
                System.out.println("go to cinema");
            }
            else if(heat >=10){
                System.out.println("go to picnic");
            }
        }else{
            System.out.println("go to swimming");
        }


    }
}