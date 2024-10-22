package Example;

interface A {
    default void sayHello(){
        System.out.println("inside interface A");
    }
}

interface B {
    default void sayHello(){
        System.out.println("inside interface A");
    }
}

public class MyClass implements A,B {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}
