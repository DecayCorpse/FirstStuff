import java.util.Scanner;

public class tuscar4 {
    public static void main(String[] args) {
        System.out.println("skolko gradyaov");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("xolodno");
        } else if (-5 >= t && t > -20) {

            System.out.println("esche holodnee");
        } else if (-20 >= t)
        {
        System.out.println("pizdec kak xolodno");
}


        }
    }

