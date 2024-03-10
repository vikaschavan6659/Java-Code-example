package Example;

public class DiffBetFinalFinallyFinalize {
    final int age = 18;
    void finalExample() {

        // reassigning value to age variable
        // gives compile time error
//        age = 55;
    }
    public static void main(String[] args) {
      DiffBetFinalFinallyFinalize diffBetFinalFinallyFinalize= new DiffBetFinalFinallyFinalize();
//      diffBetFinalFinallyFinalize.finalExample();
//        diffBetFinalFinallyFinalize.finallyExample();

        System.out.println("Hashcode is: " + diffBetFinalFinallyFinalize.hashCode());
        diffBetFinalFinallyFinalize = null;
        // calling the garbage collector using gc()
        System.gc();
        System.out.println("End of the garbage collection");
    }

    void finallyExample (){
        try {
            System.out.println("vikas chavan in side the try block ");
            int data=25/0;
            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("vikas you are  in side the finally  block ");
        }
    }

//    protected void finalize()
//    {
//        System.out.println("Called the finalize() method");
//    }
}
