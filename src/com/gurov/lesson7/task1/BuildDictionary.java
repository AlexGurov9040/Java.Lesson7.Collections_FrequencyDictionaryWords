package com.gurov.lesson7.task1;

import java.util.SortedMap;
import java.util.TreeMap;

public class BuildDictionary {

    private String text;
    private SortedMap<String,Integer> masWords;

    public BuildDictionary(String text){

        this.text = text.toLowerCase();
        masWords = new TreeMap<>();
    }

    public void RussianLanguage(){

        int start = -1;
        for (int i = 0;i<text.length();i++){
            char ch = text.charAt(i);
            boolean condition = (ch < 'а' || ch > 'я') && ch != 'ё';
            if (condition || i == text.length()-1){
                if (start != -1) {
                    String word;
                    if (i == text.length()-1 && !condition) {
                        word = text.substring(start, i + 1);
                    }
                    else {
                        word = text.substring(start, i);
                    }
                    start = -1;
                    masWords.compute(word,(key,sumValue)
                                        -> (sumValue == null)
                                        ? 1
                                        : sumValue + 1);
                }
            } else if (start == -1)
                start = i;
        }
        System.out.println(masWords);
    }

    public void EnglishLanguage(){

        int start = -1;
        for (int i = 0;i<text.length();i++){
            char ch = text.charAt(i);
            boolean condition = ch < 'a' || ch > 'z';
            if (condition || i == text.length()-1){
                if (start != -1) {
                    String word;
                    if (i == text.length()-1 && !condition) {
                        word = text.substring(start, i + 1);
                    }
                    else {
                        word = text.substring(start, i);
                    }
                    start = -1;
                    masWords.compute(word,(key,sumValue)
                            -> (sumValue == null)
                            ? 1
                            : sumValue + 1);
                }
            } else if (start == -1)
                start = i;
        }
        System.out.println(masWords);
    }
}
