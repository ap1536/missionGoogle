package com.msg.ctci;

import com.msg.ctci.fourthedition.Chapter1;

/**
 * Main method. Begining of CTCI
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Google!!");
        System.out.println("Let's Begin");

        //1.1 and 1.3
        final String[] words = new String[]{"Cracking", "the", "Coding", "Interview", "abcd", "aaaa", "","aaabbb","ababab"};
        Chapter1 ch1 = new Chapter1();
        String sentence = ch1.makeSentence(words);

        //1.4
        String str1 = "listen";
        String str2 = "silcn";
        boolean isAnagramFlag = ch1.isAnagram(str1, str2);
        System.out.println("Word "+str1+" and word "+str2+((isAnagramFlag)?" are anagrams.":" are not anagrams"));

        //1.5
        String replaceSpace = "Cracking the coding interview";
        ch1.replaceSpaceFun(replaceSpace);
    }
}