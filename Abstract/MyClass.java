package Abstract;

public class MyClass {
    public static void main(String[] args) {
//        Employee b =new B();
//
//        System.out.println(b.sayHello());

        Employee employee = ()-> "Softer Engineer";
        System.out.println(employee.sayHello());
    }
}
