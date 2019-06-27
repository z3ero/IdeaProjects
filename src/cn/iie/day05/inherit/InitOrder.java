package cn.iie.day05.inherit;

public class InitOrder {
    // 初始化顺序
    Cup c1;
    Cup c2 = new Cup(2);
    {
        c1 = new Cup(1);
    }
    static {
        Cup c4 = new Cup(4);
    }
    static Cup c3 = new Cup(3);
    InitOrder(){
        System.out.println("初始化本类");
    }
    static void f(){
        System.out.println("这个类有一个方法");
    }

    public static void main(String[] args){
        InitOrder initorder = new InitOrder();
    }
}
