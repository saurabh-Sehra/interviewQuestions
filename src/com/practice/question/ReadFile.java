package com.practice.question;
/*

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {

    public static void main(String args[]) throws IOException {
        File file = new File("D:\\saurabh.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        // Condition holds true till
        // there is character in a string

        while ((st = br.readLine()) != null)
            System.out.println(st.length());
        HashMap<Character , String > map = new HashMap<>();
        for (int i = 0;i<st.length(); i++){
            char chars = st.charAt(i);
            if(map.containsKey(chars)){
                map.put(chars, map.get(chars) +1);
            }else {
                map.put(chars,"1");
            }

        }
        for(Map.Entry<Character,String> entry : map.entrySet()){
            System.out.println("Elements "+entry.getKey()+" occurs "+entry.getValue());
        }
    }
}
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "D:saurabh.txt"; // replace with your file name

        int totalWords = 0;
        Map<Character, Integer> wordCounts = new HashMap<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = br.read()) != -1) {
                char character = (char) c;
                    if (wordCounts.containsKey(character)) {
                        wordCounts.put(character, wordCounts.get(character) + 1);
                        //duplicates.add(character);
                    } else {
                        wordCounts.put(character, 1);
                    }
                }
            } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        for (Map.Entry<Character, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if(entry.getValue()>1){
                System.out.println("  duplicate");
            }
        }

     /*  for(Map.Entry<Character,Integer> map : wordCounts.entrySet()){
           if()
       }*/

    }
}

