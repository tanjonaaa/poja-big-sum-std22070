package com.poja.sum.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class BigSumService {

    public String sum(String a, String b){
        BigInteger sum;

        var bigA = new BigInteger(a);
        var bigB = new BigInteger(b);

        sum = bigA.add(bigB);

        return sum.toString();
    }
}