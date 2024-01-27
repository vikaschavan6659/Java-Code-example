package Example;

public class PrimeNumber {
    public static void main(String[] args) {
        int a=10099;
        boolean isPrime = true;
        for (int i = 2 ;i<=Math.sqrt(a);i++){
            if (a % i == 0){
                isPrime =false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Given number is a prime number: " + a);
        } else {
            System.out.println("Given number is not a prime number: " + a);
        }
    }
}
