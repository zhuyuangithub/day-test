package com.bone.leetcode.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Zhuyuanyuan47
 * @description 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * @date: 2021/8/18 4:49 PM
 */

public class PhoneNumber {

    public static void main(String[] args) {

        List<String> strings = allResult("234");

        System.out.println(strings);

    }

    public static List<String> allResult(String digits) {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        List<String> result = new ArrayList<>();
        backtrack(phoneMap, result, digits,0, new StringBuffer());
        return result;
    }


    public static void backtrack(Map<Character, String> phoneMap, List<String> result, String digits, int index, StringBuffer str) {
        if (str.length() == digits.length()) {
            result.add(str.toString());
        } else {
            char at = digits.charAt(index);
            String tmpStr = phoneMap.get(at);
            for (int i = 0; i < tmpStr.length(); i++) {
                str.append(tmpStr.charAt(i));
                backtrack(phoneMap, result, digits, index + 1, str);
                str.deleteCharAt(index);
            }
        }
    }

}
