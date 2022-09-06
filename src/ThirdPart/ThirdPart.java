package ThirdPart;

import java.util.Scanner;

public class ThirdPart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, its police department. To call the police write your address :");

        int number = sc.nextInt();

        System.out.println("Thanks. the squad went to " + number);

    }
}
