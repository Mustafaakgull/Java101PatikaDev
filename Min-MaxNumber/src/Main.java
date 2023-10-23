import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many value you will enter : ");
        int value = sc.nextInt();
        int[] arr= new int[value];

        for(int i=0;i<value;i++){
            System.out.println("Enter value : ");
            int val = sc.nextInt();
            arr[i]=val;
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<value;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max value is : "+max);
        System.out.println("Min value is : "+min);

    }
}