package Example;

import java.util.Scanner;

public class Palindrome {
     public static boolean checkStringisPalindrome(String str){
       String newString = new StringBuilder(str).reverse().toString();
       return str.equals(newString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A string which we need to check string is palindrome or not ");
         String str =scanner.nextLine();
        if (checkStringisPalindrome(str)) {
            System.out.println("given string is Palindrome " +str);
        }
        else {
            System.out.println("given string is not Palindrome"+str);
        }
    }
}
