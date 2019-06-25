package com.xiaoze17;

public class Student {
    private String name;
    private int score;

    public Student(String stu_name, int stu_score) {
        this.name=stu_name;
        this.score=stu_score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {

        Array<Student> arr = new Array<>();
        arr.addLast(new Student("xiaoze", 100));
        arr.addFirst(new Student("qingqing",90));

        System.out.println(arr);
    }
}
