package Example;

public class patn {
    public static void main(String[] args) {
        int count = 4;
        for (int i =0 ; i<=count ; i++){
            for (int j =0 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        reversr();
    }

    public static void reversr(){

        int count = 4;
        for (int i =0 ; i<=count ; i++){
            for (int j =0 ; j<=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
