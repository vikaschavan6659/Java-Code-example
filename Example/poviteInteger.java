package Example;


import java.util.Scanner;

/*The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x.
 If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.*/
public class poviteInteger {



    public static double poviteInteger(int n){

        double sum = (n * (n+ 1)) / 2 ;
        double squroot = Math.sqrt(sum);
        if (sum == squroot * squroot){
            return squroot;
        }
        else {
            return -1;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
         int ans= (int) poviteInteger(n);
        System.out.print(ans);
    }
}
