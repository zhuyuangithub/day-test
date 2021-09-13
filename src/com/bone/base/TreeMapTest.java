package com.bone.base;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/9/8 5:14 PM
 */

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        treeMap.put(new Student(10), "hi");
        treeMap.put(new Student(19), "hi");
        treeMap.put(new Student(6), "hi");
        treeMap.put(new Student(2), "hi");
        treeMap.put(new Student(23), "hi");
        treeMap.put(new Student(7), "hi");
        treeMap.entrySet().forEach(studentStringEntry -> System.out.println(studentStringEntry.getKey().getAge()));
    }
}


