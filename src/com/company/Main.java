package com.company;

import com.company.message.MessageCreator;

public class Main {

    public static void main(String[] args) {

        MessageCreator creator = new MessageCreator("Message...", "Посмотри картинку",
                                                "vasya@ya.ru", "petya@ya.ru", new Object());
        creator.create();

    }
}
