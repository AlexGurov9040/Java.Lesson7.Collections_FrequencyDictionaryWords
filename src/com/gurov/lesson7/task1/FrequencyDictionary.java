package com.gurov.lesson7.task1;

import java.util.Scanner;

public class FrequencyDictionary {

    public static void main(String[] args) {

        FrequencyDictionary app = new FrequencyDictionary();
        app.Start();
    }

    public static void Start(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Russian text: ");
        String text = in.nextLine();
        BuildDictionary RussianText = new BuildDictionary(text);
        RussianText.RussianLanguage();
        System.out.print("Enter the English text: ");
        text = in.nextLine();
        BuildDictionary EnglishText = new BuildDictionary(text);
        EnglishText.EnglishLanguage();
    }
}
