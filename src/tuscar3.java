import java.util.Scanner;

public class tuscar3 {
    public static void main(String[] args) {
        System.out.println("Vvedite 4islo");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
