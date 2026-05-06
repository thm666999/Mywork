题目：
     从键盘输入一个字符串，将字符串中的各个单词的字母顺序反转，然后输出处理后的结果。

答案：

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
