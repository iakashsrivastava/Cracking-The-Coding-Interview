package CCD;

/**
 * Created by akash on 5/25/16.
 */
// Problem
//Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated string.

// Solution
// Use StringBuilder inbuilt reverse method

// Complexity
// O(n) i.e. the time complexity of String Builder method

public class ReverseStringQ2 {

    public String reverseString(String str) {
        return  new StringBuilder(str).reverse().toString();
    }

    public static void main(String args[]){

        ReverseStringQ2 obj = new ReverseStringQ2();

        String str = "Anaconda";

        String reversedString = obj.reverseString(str);

        System.out.println("Reverse of "+ str +" is : "+reversedString);
    }

}
