package com.bone.base;

import java.util.Comparator;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/9/8 5:49 PM
 */

public class Student implements Comparable<Student> {

    private Integer age;

    public Student(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

}

