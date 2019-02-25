package com.geek.homework.lesson4;

public class ProxyPattern {


    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();

        image.display();
    }

}
