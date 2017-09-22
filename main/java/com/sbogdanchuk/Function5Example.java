package com.sbogdanchuk;
import java.util.Arrays;
import java.util.List;

/**
 * This example demonstrates creation and use of the function with five arguments
 *
 * Created by sbogdanchuk on 22-Sep-17
 */
public class Function5Example {
    static List<String> send(String a, String b, int c, int d, double e) {
        return Arrays.asList(a, b, Integer.toString(c), Integer.toString(d), Double.toString(e));
    }

    static List<String> send2(String a, String b, int c, int d, double e) {
        String s2 = "_2";
        return Arrays.asList(a + s2, b + s2, Integer.toString(c) + s2, Integer.toString(d) + s2, Double.toString(e) + s2);
    }

    @FunctionalInterface
    interface Function5<R, A, B, C, D, E> {
        public R apply(A a, B b, C c, D d, E e);
    }

    static List<String> caller(Function5<List<String>, String, String, Integer, Integer, Double> f) {
        String a = "a";
        String b = "b";
        Integer c = 3;
        Integer d = 4;
        Double e = 5.0;

        return f.apply(a, b, c, d, e);

    }

    public static void main(String[] args) {
        Function5<List<String>, String, String, Integer, Integer, Double> f = (a, b, c, d, e) -> send(a, b, c, d, e);
        Function5<List<String>, String, String, Integer, Integer, Double> f2 = (a, b, c, d, e) -> send2(a, b, c, d, e);
        System.out.println(caller(f));
        System.out.println(caller(f2));
    }
}
