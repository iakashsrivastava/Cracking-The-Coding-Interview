package CCD;

/**
 * Created by akash on 5/25/16.
 */

// Problem
// Given two strings, write a method to decide if one is a permutation of the other.

// Solution
// Convert both the strings into character array and sort them

// Complexity
// we will be using Arrays.sort for sorting, which in recent JDK is implemented with Dual-pivot Quicksort algorithm
// which has O(n log n) average complexity and is performed in-place (e.g. requires no extra space)

// Code
import java.util.Arrays;
public class StringPermutationQ3 {

    public String sortString(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return ch.toString();
    }

    public boolean isEqual(String str1, String str2){
        return str1.equals(str2);
    }


    public static void main(String[] args){

        StringPermutationQ3 obj = new StringPermutationQ3();

        boolean isPermutation;
        String str1 ="blub";
        String str2 ="bulb";

        String sortedStr1 = obj.sortString(str1);
        String sortedStr2 = obj.sortString(str2);

        isPermutation = obj.isEqual(sortedStr1, sortedStr2);

        if(isPermutation)
            System.out.println("Both Strings are permutation of the other");
        else
            System.out.println("Both Strings are not permutation of the other");

    }
}
