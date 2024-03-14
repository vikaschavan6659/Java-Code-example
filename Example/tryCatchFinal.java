package Example;



public class tryCatchFinal {
    public static void main(String[] args) {
       String  vikas=checkTryCatchFinalMethode();
       System.out.print(vikas);
    }

    private static String checkTryCatchFinalMethode() {

        String vikas = null;
        String vvikas;
        try {
             vikas="vikas chavan";
             vikas=null;
            int length = vikas.length();
        }catch (Exception e){
            System.out.print("exception handel : "+e);
        }
        finally {
              vvikas= "you call finally method";
        }
        return vikas+ vvikas;
    }
}
