package Example;

  abstract class Samples {
    public abstract void show();
}


interface Sampling {
      static void show(){
          System.out.println("Interface pringitng ");
      }

      default void showing(){
          System.out.println("Showing data ");
      }
}

class  Driver extends Samples implements  Sampling{

    @Override
    public void show() {
        Sampling.show();

        System.out.println("Print ");
    }

    public void showing(){
        System.out.println("Showing data for driver ");
    }
}


public class Sample{
    public static void main(String[] args) {
        Driver driver= new Driver();
        driver.show();
        driver.showing();

    }
}