package com.company.message;

class Message {

    private MessageBody messageBody;
    private Attachment attachment;
    private MessageHeader messageHeader;

    public Message(MessageBody messageBody, Attachment attachment, MessageHeader messageHeader) {
        this.messageBody = messageBody;
        this.attachment = attachment;
        this.messageHeader = messageHeader;
    }
}
