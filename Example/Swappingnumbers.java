package Example;

public class Swappingnumbers {
    public static void main(String[] args) {
        int a,b;
        a=10; b=20;
        b=b+a; // now b is sum of two number
        a=b-a;
        b=b-a;

        System.out.println("\na == "+a+" b == "+b);

    }
}
