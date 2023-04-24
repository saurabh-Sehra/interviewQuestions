package com.practice.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOFChar {

    public static void main(String args[]) {

        List list = new ArrayList();
        String s = "asdsdaads";
        int a = s.length();
        System.out.println(a);
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            if (map.containsKey(chars)) {
                map.put(chars, map.get(chars) + 1);
            } else {
                map.put(chars, 1);
            }
        }

        System.out.println("Character count: " + map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("elements " + entry.getKey() + "  occures " + entry.getValue());
        }

    }
}
