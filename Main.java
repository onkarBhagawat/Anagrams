import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////
//
//  Function name : Anagram
//  Input : string
//  Output :  string
//  Description :   It is used to find out the String is Anagram or not.
//  Autor : Omkar Vijay Bhagawat
//  Date :  31-03-2021
//
//////////////////////////////////////////////////////////////
class Demo {
    boolean Anagram(String sFirst, String sSecond) {

        char Name1[];
        char Name2[];
        char Temp;

        Name1 = sFirst.toCharArray();
        Name2 = sSecond.toCharArray();
        for (int j = 0; j < Name1.length; j++) {
            if ((Name1[j] >= 'A') && (Name1[j] <= 'Z')) {
                Name1[j] = (char) (Name1[j] + 32);
            }

            else if ((Name2[j] >= 'A') && (Name2[j] <= 'Z')) {
                Name2[j] = (char) (Name2[j] + 32);
            }

        }

        for (int j = 0; j < Name1.length; j++) {
            for (int i = 0; i < (Name1.length) - 1; i++) {
                if (Name1[i] > Name1[i + 1]) {
                    Temp = Name1[i];
                    Name1[i] = Name1[i + 1];
                    Name1[i + 1] = Temp;

                }

            }

            for (int i = 0; i < (Name2.length) - 1; i++) {
                if (Name2[i] > Name2[i + 1]) {
                    Temp = Name2[i];
                    Name2[i] = Name2[i + 1];
                    Name2[i + 1] = Temp;

                }

            }

        }

        String s1 = new String(Name1);
        String s2 = new String(Name2);

        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }

    }
}

class Main {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Eneter 1st string");
        String sFirst = sobj.nextLine();
        System.out.println("Eneter 2nd string");
        String sSecond = sobj.nextLine();
        Demo obj = new Demo();
        boolean bret = obj.Anagram(sFirst, sSecond);
        if (bret == true) {
            System.out.println("Anagrams");
        } else {
            System.out.println(" Not Anagrams");
        }

    }
}
