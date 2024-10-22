package Example;

/*
You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure indicate the result:

Build the result list and return its head.

Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
*/

import java.util.ArrayList;
import java.util.List;

public class Merge_In_Between_Linked_Lists {
    public static void main(String[] args) {
        int[] list1 = {0, 1, 2, 3, 4, 5, 6};
        int a = 2;
        int b = 5;

        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if (a <= i && i <= b) {
                int initial = 1000;
                list3.add(initial + i - a);
            } else {
                list3.add(list1[i]);
            }
        }

        System.out.println(list3);
    }
}
