package cn.iie.day08.Interfacee;

// 先继承 后 实现
public class ComparableCircle extends Circle implements CompareObject{
    public int compareTo(Object o){
        Circle circle = (Circle) o;
        if (this.getRadius() > circle.getRadius()){
            return 1;
        }else if (this.getRadius() < circle.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }

    public ComparableCircle(){

    }

    public ComparableCircle(double radius){
        super(radius);
    }

    public static void main(String[] args){
        ComparableCircle c1 = new ComparableCircle(2);
        ComparableCircle c2 = new ComparableCircle(2);
        int result = c1.compareTo(c2);
        System.out.println(result);
    }

}
