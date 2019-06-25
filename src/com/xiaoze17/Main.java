package com.xiaoze17;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array<Integer> array = new Array<>();
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        //bu jia zhu shi ,hui warn ?
        array.addFirst(-1);
        System.out.println(array);

        array.deleteLast();
        System.out.println(array);
        array.deleteLast();
        System.out.println(array);

    }
}
