package com.bone.leetcode.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/8/19 10:42 AM
 */

public class ValidStr {

    public static void main(String[] args) {

    }


    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) return false;
        Map<Character, Character> validMap = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };
        LinkedList<Character> chars = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (validMap.containsKey(tmp)) {
                if (chars.isEmpty() || chars.pop() != validMap.get(tmp)) {
                    return false;
                }
            } else {
                chars.push(tmp);
            }
        }
        return chars.isEmpty();
    }
}
