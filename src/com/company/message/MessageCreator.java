package com.company.message;

public class MessageCreator {
    private String message, subject, from, to;
    private Object attachment;

    public MessageCreator(String message, String subject, String from, String to) {
        this.message = message;
        this.subject = subject;
        this.from = from;
        this.to = to;
    }

    public MessageCreator(String message, String subject, String from, String to, Object attachment) {
        this.message = message;
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.attachment = attachment;
    }

    public void create(){
        MessageBody messageBody = new MessageBody(message);
        Attachment messageAttachment = new Attachment(attachment);
        MessageHeader header = new MessageHeader(subject, from, to);
        Message message = new Message(messageBody, messageAttachment, header);
        MessageSender sender = new MessageSender(message);
        sender.send();
    }
}
