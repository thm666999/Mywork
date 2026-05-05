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