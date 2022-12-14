package com.msg.ctci.fourthedition;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class Chapter1 {
    public HashMap<Integer,String> buildMap(){
        HashMap<Integer,String> bm= new HashMap<>();
        bm.put(1,"Aravind");
        bm.put(2, "Google");
        return bm;
    }

    public ArrayList<Integer> buildList(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        return al;
    }

    public String makeSentence(String @NotNull [] words){
        StringBuilder sentence = new StringBuilder();
        for(String word:words){
            sentence.append(word);
            boolean flag = checkIfStringHasUniqueChars(word.toLowerCase());
            System.out.println("Word "+word+((flag)?" contains unique letters":" contains duplicate letters"));
            if(!flag){
                word = removeDuplicateChars(word.toLowerCase());
                System.out.println("  --  After removing duplicate characters new word is : "+word);
            }
        }
        return sentence.toString();
    }

    private String removeDuplicateChars(String word) {
        StringBuilder new_word = new StringBuilder();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if(new_word.toString().indexOf(c) < 0){
                new_word.append(c);
            }
        }
        return new_word.toString();
    }

    /**
     * 1.1 Implement an algorithm to determine if a string has all unique characters.
     * What if you can not use additional data structures?
     * @param word is input string
     * @return boolean value true if word contains unique characters else false
     */
    public boolean checkIfStringHasUniqueChars(String word) {
        boolean[] char_set = new boolean[26];
        for(int i=0;i<word.length();i++){
            int val = word.charAt(i)-'a';
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] char_arr = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            char_arr[str1.charAt(i)]++;
            char_arr[str2.charAt(i)]--;
        }
        for (int j : char_arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public void replaceSpaceFun(String replaceSpace) {
        StringBuilder sb = new StringBuilder();
        for (char c : replaceSpace.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        System.out.println("Sentence after replacing spaces with %20 :");
        System.out.println(sb);
    }
}
