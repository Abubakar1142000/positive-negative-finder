import java.util.Scanner;

public class PositiveNegativeFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer =");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            checkNumber(num);
        } else {
            System.out.println("Please Enter Valid Number");
        }
        sc.close();

    }

    public static void checkNumber(int n) {
        if (n > 0) {
            System.out.println("Positive");

        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Neither Positive nor Negative.");
        }
    }
}
