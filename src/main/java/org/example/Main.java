package org.example;

public class Main {
    public static int reverseBits(int n) {
        StringBuilder ans = new StringBuilder(Integer.toBinaryString(n));

        ans.reverse();
        while (ans.length() != 32) ans.append('0');

        return Integer.parseUnsignedInt(ans.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));

    }
}