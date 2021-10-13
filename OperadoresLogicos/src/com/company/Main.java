package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean x = true, y = false, z =true;
        System.out.println((x && y) || (x &&z ));
        System.out.println((x || !y) && (!x || z));
        System.out.println(x || y && z);
        System.out.println(!(x || y) && z);
        System.out.println(x||y||x&&!z&&!y);
        System.out.println(!x||!y||z&&x&&!y);
    }
}
