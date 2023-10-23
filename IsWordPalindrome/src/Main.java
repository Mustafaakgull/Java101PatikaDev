import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        Main m1 = new Main();

        if(m1.isPalindrome(word)){
            System.out.println("The word is a palindrome!");
        }
        else{
            System.out.println("The word is not a palindrome!");
        }
    }
    public boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}