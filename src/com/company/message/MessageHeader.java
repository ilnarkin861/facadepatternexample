package com.company.message;

class MessageHeader {
    private String subject, from, to;

    public MessageHeader(String subject, String from, String to) {
        this.subject = subject;
        this.from = from;
        this.to = to;
    }
}
