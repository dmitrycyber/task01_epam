package com.divoninsky.simpleTasks.task3;

public class Main {
    public static void main(String[] args) {
        int a = -2;
        int b = -1;
        int c = 0;

        if (a > b && b > c){
            a*=2;
            b*=2;
            c*=2;
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
