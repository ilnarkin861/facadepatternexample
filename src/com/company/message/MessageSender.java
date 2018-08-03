package com.company.message;

class MessageSender {

    private Message message;

    public MessageSender(Message message) {
        this.message = message;
    }

    public void send(){
        System.out.println("Message sent...");

    }
}