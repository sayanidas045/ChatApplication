package com.practice.sayani.service;

import com.practice.sayani.model.User;

public interface MessageHandler {
    void sendMessage(int id, String text, User sender, User reciever );
    void displayMessage(User sender,User reciever);
}
