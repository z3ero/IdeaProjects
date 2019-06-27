package cn.iie.day04.encapsulation;

import cn.iie.day04.encapsulation.Person;
public class Test {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println("名字为:"+p.getName());
        p.setName("梁三");
        System.out.println("名字为"+p.getName());

    }
}
