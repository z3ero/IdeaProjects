package cn.iie.day07.abstarctt;

public class Cat extends Animal{
    public void eat(){
        System.out.println("eat phish!");
    }
    public static void main(String[] args){
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        };
        Cat cat = new Cat();
    }
}
