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