import java.util.Scanner;

public class cikl3 {
    public static void main(String[] args) {
        int guldan;
        int summ;
        System.out.println("vvedite chislo");
        Scanner scanner = new Scanner(System.in);
        guldan = scanner.nextInt();
        for (int i = 0; i <= guldan; i++){
            System.out.println(i);
        }
    }
}
