import java.util.Scanner;

public class tuscar2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Vvedite mesyac");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n == 1 || n == 2 || n == 12) {
            System.out.println("winter");
        } else if (n == 3 || n == 4 || n == 5) {
            System.out.println("spring");
        } else if (n == 6 || n == 7 || n == 8) {
            System.out.println("summer");
        } else if (n == 9 || n == 10 || n == 11) {
            System.out.println("outumn");
        }

    }
}


