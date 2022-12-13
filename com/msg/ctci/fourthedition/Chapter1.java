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
            if(!flag) word = removeDuplicateChars(word);
            System.out.println("After removing duplicate characters "+word);
        }
        return sentence.toString();
    }

    private String removeDuplicateChars(String word) {
        if (word == null) {
            return null;
        }
        char[] word_arr = word.toCharArray();
        int len = word.length();
        if(len < 2) return word;
        boolean[] hit = new boolean[256];
        hit[word_arr[0]] = true;
        int tail = 1;
        for(int i=1;i<len;++i){
            if(!hit[word_arr[i]]){
                word_arr[tail]=word_arr[i];
                ++tail;
                hit[word_arr[i]]=true;
            }
        }
        word_arr[tail]=0;
        return new String(word_arr);
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
}
