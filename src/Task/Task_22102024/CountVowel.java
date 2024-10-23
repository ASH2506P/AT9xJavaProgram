package Task.Task_22102024;

import java.util.Scanner;

public class CountVowel
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        str = str.toLowerCase();

        int VCount = 0;
        int ccount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                VCount++;
            } else {
                ccount++;
            }


        }
        System.out.println("Vowel count is :" + VCount);
        System.out.println("Consonant count is :" + ccount);


    }//  str->ashish  then Vowel count is :2  Consonant count is :4
}
