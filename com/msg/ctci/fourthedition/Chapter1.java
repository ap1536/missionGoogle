package com.msg.ctci.fourthedition;

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

    public String makeSentence(String[] words){
        StringBuilder sentence = new StringBuilder();
        for(String word:words){
            sentence.append(word);
            boolean flag = checkIfStringHasUniqueChars(word);
        }
        return sentence.toString();
    }

    public boolean checkIfStringHasUniqueChars(String word) {

        return false;
    }
}
