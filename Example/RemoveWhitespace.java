package Example;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "      vikas      Chavan   a  Full stack java Developer ";
        String string = str.replaceAll("\\s","");
        System.out.println(string);
    }
}
