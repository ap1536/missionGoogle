package com.msg.ctci;

import com.msg.ctci.fourthedition.Chapter1;

/**
 * Main method. Begining of CTCI
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Google!!");
        System.out.println("Let's Begin");
        final String[] words = new String[]{"Cracking", "the", "Coding", "Interview"};
        Chapter1 ch1 = new Chapter1();
        String sentence = ch1.makeSentence(words);
    }
}