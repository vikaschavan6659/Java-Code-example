package PredIcate.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuncationClass {
    public static void main(String[] args) {

        Function<String, Integer> stringIntegerFunction = x -> x.length();
        System.out.println(stringIntegerFunction.apply("vikas"));

        Function<String , String> firstThreeDigit = x -> x.substring(0,3);
        System.out.println(firstThreeDigit.apply("vikas"));

        Function <List<Student> , List<Student>>  studentWithViAsPrefix = students -> {
            List<Student> students1 =new ArrayList<>();
            for (Student s : students){
                if (firstThreeDigit.apply(s.getName()).equalsIgnoreCase("vik")){
                    students1.add(s);
                }
            }
            return students1;
        };

        Student s1 = new Student( "vikas",1);
        Student s2 = new Student( "vikit",2);
        Student s3 = new Student( "virat",3);
        Student s4 = new Student( "akash",4);

        List<Student> students = Arrays.asList(s1,s2,s3,s4);
        List<Student> filterStudent= studentWithViAsPrefix.apply(students);
        System.out.println(filterStudent);


    }
}

class Student{
    String name ;
    int Id ;

    public Student(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}