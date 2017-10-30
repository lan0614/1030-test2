import java.util.*;
public class Main {
//判斷奇偶數
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a;
    a=in.nextInt();
    if(a%2==0)
        System.out.printf("偶數");
    if(a%2==1)
        System.out.printf("奇數");
    }
}
