package com.geek.homework.lesson3;

import java.util.List;

public class Parsel {

    private String senderName;
    private String recipientName;
    private String deliveryAddress;
    private int weight;
    private List docsList;
    private List nameOfThingsList;
    private String info;

    static class Builder {
        private Parsel parsel;

        Builder() {
            parsel = new Parsel();
        }

        Builder senderName(String senderName) {
            parsel.senderName = senderName;
            return this;
        }

        Builder recipientName(String recipientName) {
            parsel.recipientName = recipientName;
            return this;
        }

        Builder deliveryAddress(String deliveryAddress) {
            parsel.deliveryAddress = deliveryAddress;
            return this;
        }

        Builder weight(int weight) {
            parsel.weight = weight;
            return this;
        }

        Builder docsList(List docsList) {
            parsel.docsList = docsList;
            return this;
        }

        Builder nameOfThings(List nameOfThingsList) {
            parsel.nameOfThingsList = nameOfThingsList;
            return this;
        }

        Builder info(String info) {
            parsel.info = info;
            return this;
        }

        Parsel build() {
            return parsel;
        }

    }
}

