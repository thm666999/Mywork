题目:
在“/home/java/a.txt”文件中保存了一门课的成绩，所有成绩都是整数，每行一个成绩。从键盘输入一个整数n，输出该文件中前n个成绩的最低分。
说明：成绩的取值范围为[0,100]

答案:

import java.util.*;
import java.io.File;
public class Main{
public static void main(String []args){
    try {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        File file =new File ("/home/java/a.txt");
        Scanner fileSc=new Scanner(file );
        int min=101;
        int count =0;
        while (fileSc.hasNextLine()&&count<n){
            int score=Integer.parseInt(fileSc.nextLine());
            if(score<min){
                min=score;
            }
            count++;
        }
        System.out.println(min);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
