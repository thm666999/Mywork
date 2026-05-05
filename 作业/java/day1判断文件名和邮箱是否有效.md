题目：
      判断输入的 Java 文件名与邮箱格式是否正确。其中：合法的java文件名应该以 .java 结尾（如 Test.java 正确，Testjava.txt 不正确，.java不正确）；合法的邮箱名中至少要包含 @ , 邮箱域名采用多级点分的格式（如<abc@upc.edu.cn>有效，abc@com无效）。有效的文件名输出The Java file name is valid. 无效的文件名输出The Java file name is invalid. 有效的邮箱输出The email is valid. 无效的邮箱输出The email is invalid.

答案：import java.util.Scanner;

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
