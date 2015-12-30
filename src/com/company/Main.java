package com.company;

import java.util.BitSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        StringBuilder intStr = new StringBuilder(Integer.toString(31));

       LinkedList<Integer> results = sieve(Integer.parseInt(intStr.reverse().toString()));

        results.forEach(System.out::println);

    }

    public static LinkedList<Integer> sieve(int n){
        LinkedList<Integer> primes = new LinkedList<>();
        BitSet nonPrimes = new BitSet(n+1);

        for (int p = 2; p <= n ; p = nonPrimes.nextClearBit(p+1)) {
            for (int i = p * p; i <= n; i += p)
                nonPrimes.set(i);
            primes.add(p);
        }
        return primes;
    }

}
