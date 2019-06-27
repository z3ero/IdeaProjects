package cn.iie.day03.class_object;
import java.util.Scanner;

public class Compare {
    public int max(int a, int b){
        return a>=b? a:b;
    }
    public int min(int a, int b){
        return a<b? a:b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Compare compare = new Compare();
        System.out.println("两数最大值:"+compare.max(a, b));
        System.out.println("两数最小值:"+compare.min(a, b));
    }
}
