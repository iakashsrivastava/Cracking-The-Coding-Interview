package CCD;
import java.util.HashSet;

/**
 * Created by akash on 5/25/16.
 */

//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

//Description: Add each character to hashset, if duplicate occurs return false

public class UniqueCharactersStringQ1 {


    public boolean verifyString(String str){

        HashSet<Character> hs = new HashSet<Character>();

        for(int index=0; index < str.length(); index++){

            if( !hs.add(str.charAt(index)) )
                return false;
        }

        return true;
    }

    public static void main(String args[]){

        UniqueCharactersStringQ1 obj = new UniqueCharactersStringQ1();

        String str = "My Name is Akash";
        boolean isUnique = obj.verifyString(str);

        if(isUnique)
            System.out.println("String has all unique characters");
        else
            System.out.println("String does not have all unique characters");
    }

}
