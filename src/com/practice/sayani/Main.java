package com.practice.sayani;

import com.practice.sayani.model.Message;
import com.practice.sayani.model.User;
import com.practice.sayani.service.MessageHandler;
import com.practice.sayani.service.MessageHandlerImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Message> msgList = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Hello world!");
        User a = new User("KK", 1, "online");
        User b = new User("SD",2,"offline");

//        MessageHandlerImpl messageHandler =new MessageHandlerImpl();



        MessageHandler mg = new MessageHandlerImpl();
        // interface              // class which implement this interface
        mg.sendMessage(5, "Hi",a,b);
        mg.displayMessage(a,b);

    }
}