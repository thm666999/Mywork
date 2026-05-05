题目
从键盘输入两行，第一行是一个字符串，第二行是一个关键字。统计关键字在第一行字符串中出现的次数。如果没有出现，则为0次。

答案

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String word=sc.nextLine();
        int sum=0;
        int index=0;
        while((index=line.indexOf(word,index))!=-1){
            sum++;
        index+=word.length();
        }System.out.println(word+" appears "+sum+" times.");
    }
}
