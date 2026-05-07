题目:

从键盘输入两个整数m和n，读取“/home/java/2018test.txt”文本文件中的第m行的第n个字符并输出到屏幕。

例如：如果第m行是5dSom6gT8bE3VnzW，则n=8（即第8个字符）输出的是字符T。

答案：
# import java.io.*;
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
