package SheetFour;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class stringMethods {
    public static boolean Is_palindrome (String s) {
        for (int i=0 ; i < s.length()/2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static String Remove_WhiteSpaces (String s) {
        s = s.replaceAll(" ", "");
        return s;
    }
    public static void CountOfOccurrences (String s) {
        boolean [] vis = new boolean[s.length()];
        for(int i=0 ; i < s.length() ; i++) {
            if (vis[i]) continue;
            int counter =0;
            for (int j=i; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    counter++;
                    vis[j] = true;
                }
            }
            System.out.println("The count of the  Char " + s.charAt(i) + " is : " + counter);
        }
    }
    public static String RemoveDuplicates (String s) {
        int [] ch = new int [256];
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if (ch[c] == 0) {
                ch[c] = 1;
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void NumberOfWords (String s) {
        String [] words =  s.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println("Display the Words that appear more than twice");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
    public static int TheThirdOccurrences (String s) {
        int [] count = new int [256];
        for(int i=0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            count[c]++;
            if (count[c] == 3) {
                return i;
            }
        }
        return -1;
    }
    public static void MinAbndMaxOccurrences (String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i < s.length() ; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int MinOcc = 999999999;
        int MaxOcc = 0;
        char MinChar = ' ';
        char MaxChar = ' ';
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > MaxOcc) {
                MaxOcc = entry.getValue();
                MaxChar = entry.getKey();
            }
            if(entry.getValue() < MinOcc) {
                MinOcc = entry.getValue();
                MinChar = entry.getKey();
            }
        }
        System.out.println("The minimum occurrence is " + MinOcc +" And the Char is " +  MinChar);
        System.out.println("The maximum occurrence is " + MaxOcc + " And the Char is " +  MaxChar);
    }
    public static String LongestLength (String [] s) {
        String ans = "";
        int len = -1;
        for(String str : s) {
            if (str.length() > len) {
                len = str.length();
                ans = str;
            }
        }
        return ans;
    }
    public static void MostFreString (String [] s) {
        Map<String , Integer> map = new HashMap<>();
        for(String str : s) {
            map.put(str , map.getOrDefault(str , 0) + 1);
        }
        int MaxOcc = 0;
        String ans = "";
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() > MaxOcc) {
                MaxOcc = entry.getValue();
                ans = entry.getKey();
            }
        }
        System.out.println("The most fre string is " + ans);
    }
    public static String [] ReverseTheStringWithTheEvenLen (String [] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() % 2 == 0) {
                s[i] = new StringBuilder(s[i]).reverse().toString();
            }
        }
        return s;
    }
    public static String FindTheStringWithTheMaxOccuOfaChar (String [] s) {
        String result = "";
        int globalMax = 0;
        for (String str : s) {
            int[] freq = new int[256];
            int localMax = 0;
            for (char c : str.toCharArray()) {
                freq[c]++;
                if (freq[c] > localMax) {
                    localMax = freq[c];
                }
            }
            if (localMax > globalMax) {
                globalMax = localMax;
                result = str;
            }
        }
        return result;
    }
    public static int CountTheNumberOfTheTarget (String [] s , String target) {
        int count = 0;
        for(int i = 0 ; i < s.length ; i++) {
            if(s[i].endsWith("."+target)) {
                count++;
            }
        }
        return count;
    }
    public static String [][] CountTheStringAndTheCharNonRepeated (String [] s) {
        String [][] ans = new String[s.length][2];
        for (int i = 0; i < s.length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for(Character te : s[i].toCharArray()) {
                map.put(te, map.getOrDefault(te, 0) + 1);
            }
            int counter=0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    counter++;
                }
            }
            ans[i][0] = s[i];
            ans[i][1] = String.valueOf(counter);
        }
        return ans;
    }
}
