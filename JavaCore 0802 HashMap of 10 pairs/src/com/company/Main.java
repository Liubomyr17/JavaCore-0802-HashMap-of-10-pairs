package com.company;

/*



 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}









