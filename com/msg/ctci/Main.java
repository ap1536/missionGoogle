package com.msg.ctci;

import com.msg.ctci.fourthedition.Chapter1;

/**
 * Main method. Begining of CTCI
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello Google!!");
        System.out.println("Let's Begin");

        //1.1 and 1.3 : Make sentence and remove duplicate characters
        final String[] words = new String[]{"Cracking", "the", "Coding", "Interview", "abcd", "aaaa", "","aaabbb","ababab"};
        Chapter1 ch1 = new Chapter1();
        String sentence = ch1.makeSentence(words);

        //1.4 check if given strings are anagrams
        String str1 = "listen";
        String str2 = "silcn";
        boolean isAnagramFlag = ch1.isAnagram(str1, str2);
        System.out.println("Word "+str1+" and word "+str2+((isAnagramFlag)?" are anagrams.":" are not anagrams"));

        //1.5 replace space with %20
        String replaceSpace = "Cracking the coding interview";
        ch1.replaceSpaceFun(replaceSpace);

        //1.6 roate image by 90 degrees clockwise
        // matrix can be of any size
        int[][] imageOriginal = {{1,2,3},{4,5,6},{7,8,9}};
        ch1.rotateImage(imageOriginal);
    }
}