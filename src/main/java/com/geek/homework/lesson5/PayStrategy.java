package com.geek.homework.lesson5;

public interface PayStrategy {


    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}