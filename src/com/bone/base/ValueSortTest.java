package com.bone.base;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/9/8 6:05 PM
 */

public class ValueSortTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("nihao", 3);
        map.put("1212", 6);
        map.put("ni21hao", 2);
        map.put("1312", 9);
        map.put("132314", 1);
        map.put("21232", 10);
        map.put("13121", 7);
        map.put("13141", 5);
        map.put("1224", 3);
        map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());
    }
}
