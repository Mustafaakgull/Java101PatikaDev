import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter a number: ");
        int num=scan.nextInt();

        int total=0,counter=0;
        for(int i=0;i<num;i++){
            if(i%3==0 && i%4==0){
                total+=i;
                counter++;
            }

        }

        if(counter==0){
            System.out.println("There is no number that can be divided by 3 and 4");
        }
        else{
            System.out.println("The average of the numbers that can be divided by 3 and 4 is: "+total/counter);
        }
    }
}