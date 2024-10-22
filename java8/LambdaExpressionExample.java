package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width =10;
        Drawable d = new Drawable(){
            public void draw (){
                System.out.println(
                        "Drawing "+width
                );
            }
            public void lambda(){
                int newwidth = 1+width;
                System.out.println("new width of the lambda " + newwidth);
            };
        };
        d.draw();
//        d.lambda();

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
            (n)->System.out.println(n)) ;
    }

}

@FunctionalInterface
interface Drawable{
    public void draw();
//    public void lambda();
}
