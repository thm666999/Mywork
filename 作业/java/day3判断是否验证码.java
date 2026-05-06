import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.matches("[a-zA-Z0-9]{4}")) {
            System.out.println(s + " is the verification code.");
        } else {
            System.out.println(s + " is not the verification code.");
        }
    }
}
