package cn.iie.day03.class_object;
import cn.iie.day03.class_object.Person;

public class ClassObject {
    // 验证对象是引用传递
    public void update_age(Person p){
        p.age = 200;
    }
    public static void main(String[] args){
        ClassObject co = new ClassObject();
        Person p = new Person();
        System.out.println(p.age);
        co.update_age(p);
        System.out.println(p.age);
    }

}
