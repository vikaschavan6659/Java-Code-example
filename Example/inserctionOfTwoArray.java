package Example;
/*
* Given two integer arrays nums1 and nums2, return an array of their intersection.
* Each element in the result must be unique and you may return the result in any order.*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class inserctionOfTwoArray {

    public List<Integer> intersection(List<Integer> nums1, List<Integer> nums2) {
        // Convert lists to sets to remove duplicates
        Set<Integer> set1 = new HashSet<>(nums1);
        Set<Integer> set2 = new HashSet<>(nums2);

        // Find the intersection of the two sets
        set1.retainAll(set2);

        // Convert the set back to a list
        List<Integer> result = new ArrayList<>(set1);

        return result;
    }



    public static void main(String[] args) {
        inserctionOfTwoArray inserction =new inserctionOfTwoArray();
        // Create two lists of integers

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(2);
        nums1.add(1);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(2);
        nums2.add(2);
        nums2.add(1);

        // Call the intersection method
        List<Integer> commonElements = inserction.intersection(nums1, nums2);

        // Print the result
        System.out.println("Common elements are: " + commonElements);
    }

}
