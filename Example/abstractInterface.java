package Example;


interface Biycycle{

    int vikas=7080;
    void applyBreak(int increment );
    void speedUp(int apply);
}

class AvconCycle implements Biycycle{

    void blloHorne(){
        System.out.print("poo poo ");
    }

    @Override
    public void applyBreak(int increment) {
        System.out.print("apply break ");
    }

    @Override
    public void speedUp(int apply) {
        System.out.print("speed up  apply  ");
    }
}


abstract class Aarya implements Biycycle{
     public  void applyBreak(int increment ){
         System.out.print("in side abstract methode ");
     }
}
class New extends Aarya{
    @Override
    public void speedUp(int apply) {

    }
}



public class abstractInterface {
    public static void main(String[] args) {
        AvconCycle avconCycle = new AvconCycle();
        avconCycle.applyBreak(55);
        int vikas = avconCycle.vikas;
        System.out.print("\n" + vikas);

//        aarya.applyBreak(2);
    }
}
