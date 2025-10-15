package org.example.CoreJava;

public class Main {
    public static void main(String[] args) {
        ArrayList_<String> list = new ArrayList_<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list); // [A, B, C]

        list.remove(1);
        System.out.println(list); // [A, C]

        list.set(1, "Z");
        System.out.println(list.get(1)); // Z
    }
}

