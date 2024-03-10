package Example;

public class pattern {
    public static void main(String[] args) {
//        int row = 6;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        starePattern();
        star();
        primade();

    }

    public static void starePattern(){
        int row= 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void star(){
        int row= 4;
        for (int i = 0; i<row ; i++){
            for(int j = 0 ; j <= i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void primade() {
        int pri = 4;
        for (int i = 0; i < pri; i++) {

            for (int j = pri - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
