package Example;

public class StaticNonStatic {


    {
        System.out.println("sanket");
    }

    public static void main(String[] vikas) {

        System.out.println("suvarna ");

        StaticNonStatic nonStatic = new StaticNonStatic();
    }

    static {

        System.out.println("vikas");
//        get();
    }
    public static void get (){
        System.out.println("in side the methode ");
    }
}
