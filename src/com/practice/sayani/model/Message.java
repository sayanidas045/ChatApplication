package com.practice.sayani.model;

public class Message {
    private int id;
    private String messageText;
    private User sender;
    private User reciever;

    public Message(int id, String messageText, User sender, User reciever) {
        this.id = id;
        this.messageText = messageText;
        this.sender = sender;
        this.reciever = reciever;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReciever() {
        return reciever;
    }

    public void setReciever(User reciever) {
        this.reciever = reciever;
    }
}
