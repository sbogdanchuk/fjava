package com.sbogdanchuk;

public class FinalityTest {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        try{
            return "a";
        }finally {
            return "b";
        }
    }
}
