package Example;

public class ReverseString {
    public static void main(String[] args) {
        String name ="vikas";
        String newString="";
         char ch;
        for (int i=0 ; i<name.length() ;i++){
            ch=name.charAt(i);
            System.out.println(ch);
            newString=ch+newString;
            // for checking the char is inserting or not
//            System.out.println(newString);

        }
        System.out.println(name+" === "+newString);
    }
}
