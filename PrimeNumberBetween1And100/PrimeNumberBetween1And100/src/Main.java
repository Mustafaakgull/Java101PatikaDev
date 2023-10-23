public class Main {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime = false;
        System.out.println("All Prime Numbers Between 1 to 100");

        for (i = 2; i <= 100; i++) {
            isPrime = false;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime)
                System.out.print(i + " ");
        }

    }
}