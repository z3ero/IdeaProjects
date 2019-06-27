package cn.iie.day02.basic;
import java.util.Scanner;
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

        // 1. 输入输出
        /**
        Scanner sc  = new Scanner(System.in);
        System.out.printf("输入的整数为"+sc.nextInt()+'\n');
        System.out.println("输入的常规字符串(不带特殊字符)"+sc.next());
        System.out.println("输入的特殊字符串(带特殊字符)"+sc.nextLine()+'\n');
        */
        // 2. while 循环
        // 输入整数个数不确定, 找出整数和负数的个数，用0表示终止输入
        /**
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int number = sc.nextInt();  // 输入的数字
        while(number!=0){
            if (number>0)
                positive++;
            else
                negative++;
            number = sc.nextInt();
        }
        System.out.printf("整数和负数的个数分别为:"+positive+' '+negative);
         */
        // 3. do-while 循环
        /**
        number = 0;
        positive = 0;
        negative = 0;
        do {
            number = sc.nextInt();
            if (number>0)
                positive++;
            else if (number<0)
                negative++;
        }while(number!=0);
        System.out.printf("整数和负数的个数分别为:"+positive+' '+negative);
         */

        // 计算 1+2+..n
        System.out.println("输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;   //记录求和
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("1~"+ num + "的和为" + sum);

        // 求100-999水仙花数 cba = c**3 + b**3 + c**3
        for(int i=100; i<=999; i++){
            int a = i/100;
            int b = i/10%10;
            int c = i%10;
            if(Math.pow(a, 3) + Math.pow(b,3) + Math.pow(c, 3)==i){
                System.out.println(i);
            }
        }

        // for  循环嵌套： 打印 9*9 乘法表
        for(int i = 1; i <=9; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }

    }
}
