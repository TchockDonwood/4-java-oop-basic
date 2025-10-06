package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(0, 50, 0);
        TimeSpan t2 = new TimeSpan(0, 10, 0);
        t1.add(t2);
        System.out.println(t1.toString());
    }
}
