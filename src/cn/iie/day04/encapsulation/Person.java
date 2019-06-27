package cn.iie.day04.encapsulation;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String pwd;

    //构造方法
    // 无参构造方法
    public Person(){

    }
    public Person(String name, String pwd){
        this.name = name;
        this.pwd = pwd;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPwd(){
        return pwd;
    }

    public static void main(String[] args){
        Person p = new Person("梁三","123456");
        System.out.println("用户名和密码为 "+p.getName()+" "+p.getPwd());
    }
}
