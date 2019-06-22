package cn.iie.day02.basic;

import java.net.SocketTimeoutException;

public class BasicKnow {
    public static void main(String[] args){
        // 赋值运算符
        // =, +=, -=, *=, /=
        short s = 3;
        s = (short)(s+4);
        s+=4;   // 为什么这个不需要强制类型转换

        // 比较运算符
        // ==, !=, <, >, <=, >=
        System.out.println("4 等于3 ？"+(4==3));
        String name = "liang";
        System.out.println("name is wang?"+"wang".equals(name));
        // 注意删除：用 "wang".equal(name), 而不是 name.equal("wang")

        // 逻辑运算符
        // & | ^ ! && ||
        int height = 190;
        int rich = 100000;
        boolean handsome = true;
        System.out.println("要找的男朋友"+((height>180)&&(rich>100000)&&handsome));

        int skinwhite = 190;
        int rich2 = 100000;
        boolean handsome2 = true;
        System.out.println("要找的女朋友"+((skinwhite>180)||(rich2>100000)||handsome));

        //三元运算符
        int score = 90;
        System.out.println("张三的成绩为:"+(score>=60?59:score));

        Scanner sc  = new Scanner(system.in);
    }
}
