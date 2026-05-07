import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        BufferedReader br = new BufferedReader(new FileReader("/home/java/2018test.txt"));
        String line = null;
        int currentLine = 0;
        char result = 0;
        
        while ((line = br.readLine()) != null) {
            currentLine++;
            if (currentLine == m) {
                if (n <= line.length()) {
                    result = line.charAt(n - 1);
                }
                break;
            }
        }
        System.out.println(result);
    }
}