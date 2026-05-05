import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        String mail = sc.nextLine();

        if (file.endsWith(".java") && file.length() > 5) {
            System.out.println("The Java file name is valid.");
        } else {
            System.out.println("The Java file name is invalid.");
        }

        boolean hasAt = mail.contains("@");
        String domain = mail.split("@")[1];
        boolean hasDot = domain.contains(".") && domain.indexOf(".") > 0
                && domain.lastIndexOf(".") != domain.length() - 1;

        if (hasAt && hasDot) {
            System.out.println("The email is valid.");
        } else {
            System.out.println("The email is invalid.");
        }
    }
}
