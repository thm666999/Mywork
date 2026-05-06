题目：

    从键盘输入一个字符串s，判断该字符串是否属于验证码。验证码是由四位数字或者字母（包含大小写）组成的字符串（如：76h9）。是验证码就输出“s is the verification code.”，否则输出“s is not the verification code.”。

答案：

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
