package cn.iie.day03.class_object;

public class Circle {
    double radius;   // 数值类型默认初始化都是 0，这里是0.0
    // 计算圆的面积
    public double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args){
        Circle cir = new Circle();
        cir.radius = 2;
        double area = cir.getArea(cir.radius);
        System.out.println("圆的面积为"+area);
    }
}
