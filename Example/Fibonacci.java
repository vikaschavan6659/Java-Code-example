package Example;

public class Fibonacci {

    public static void FibonacciSequience(int num ){
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1 ; i <= num ;i++){
            System.out.print(a + ", ");
            a=b;
            b=c;
            c=a+b;
        }
    }
//    public static void main(String[] args) {
//
//
//        int a = 0;
//        int b = 1;
//        int c = 1;
//
//        int count = 10;
//        String sequence="";
//        // Fibonacci sequence  is
//        // 1, 1 , 3 , 5 ,8
//        for (int i = 1; i <= count; i++) {
//            System.out.println(a+ ",");
//            sequence=a+ ",";
//            a = b;
//            b = c;
//            c = a + b;
//
//        }
//
//        System.out.println(sequence);
//    }

    public static void main(String[] args) {
        FibonacciSequience(10);
    }
}
