import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        
        for (String w : words) {
            res.append(new StringBuilder(w).reverse()).append(" ");
        }
        
        System.out.println(res.toString().trim());
    }
}
