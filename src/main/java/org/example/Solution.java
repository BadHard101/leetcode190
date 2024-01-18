package org.example;

public class Solution {
    
    public static int reverseBits(int n) {
        int reverse = 0;
        System.out.println(Integer.toBinaryString(n));
        for (int i = 0; i < 32; i++) {
            reverse = reverse << 1;
            reverse = reverse | (n & 1);
            n = n >> 1;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}