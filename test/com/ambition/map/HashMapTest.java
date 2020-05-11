package com.ambition.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Elewin
 * @date 2020-05-11 3:25 PM
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
