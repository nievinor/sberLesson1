import java.util.Scanner;
import static testPackage.PrintClass.printMessage;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of repetitions: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            printMessage(i);
        }
    }
}
