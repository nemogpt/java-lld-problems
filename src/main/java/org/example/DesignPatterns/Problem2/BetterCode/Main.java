package org.example.DesignPatterns.Problem2.BetterCode;

public class Main {
    public static void main(String[] args) {
        User naman= User.builder()
                        .setAge(11)
                .setName("Naman")
                .build();
        System.out.println(naman);
    }
}
