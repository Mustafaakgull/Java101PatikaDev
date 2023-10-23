import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String UserName="Mustafa";
        String Password="123";
        System.out.println("Enter your username");
        String username=sc.nextLine();
        System.out.println("Enter your password");
        String password=sc.nextLine();
        if (username.equals(UserName) && password.equals(Password)){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong username or password");
            System.out.println("Do you want to change your password? (Y/N)");
            String answer=sc.nextLine().toUpperCase();
            if(answer.equals("Y")){
                System.out.println("Enter your new password");
                String newPassword=sc.nextLine();
                if (newPassword.equals(Password)){
                    System.out.println("Could not create password, please enter a different password");
                }
                else {
                    System.out.println("Password has chanced");
                    Password=newPassword;
                }
            }
            else if (answer.equals("N")){
                System.out.println("Goodbye");
            }
            else {
                System.out.println("Wrong answer");
            }
        }
    }
}