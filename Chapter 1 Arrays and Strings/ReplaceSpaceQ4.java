package CCD;

/**
 * Created by akash on 5/25/16.
 */

// Problem
// Write a method to replace all spaces in a string with'%20'. You may assume that the string has sufficient space at
// the end of the string to hold the additional characters, and that you are given the "true" length of the string.
// EXAMPLE
//      Input: "Mr John Smith"
//      Output: "Mr%20Dohn%20Smith"


// Description
// Iterate over complete String if space replace with %20

// Complexity
// O(n)

public class ReplaceSpaceQ4 {

    public static void main(String[] args){

        String str = "Mr John Smith";
        String newStr ="";

        for(int i=0; i < str.length(); i++)
            if( str.charAt(i) == ' ')
                newStr += "%20";
            else
                newStr += str.charAt(i);

        System.out.println("New String is: "+ newStr);
    }
}
