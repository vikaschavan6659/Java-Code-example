package Example;

public class vowels {
    public static void main(String[] args) {
        String str = " VIKAS ";
        boolean b = str.toLowerCase().matches(".*[aeiou].*");
        System.out.println(b);
    }
}
