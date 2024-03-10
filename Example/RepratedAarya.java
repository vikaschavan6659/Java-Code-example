package Example;

import java.util.*;

public class RepratedAarya {
    public static void main(String[] args) {
        int arrya[]={0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i :arrya){
                map.put(i,map.getOrDefault(i,0)+1);

        }

        for (Map.Entry<Integer,Integer> ii:map.entrySet()) {
            if (ii.getValue()>1){
//                System.out.println(ii);

            }
            System.out.println(ii);
        }

//        Set<Integer>integers=new HashSet<>(Arrays.stream(arrya).map());

    }
}
