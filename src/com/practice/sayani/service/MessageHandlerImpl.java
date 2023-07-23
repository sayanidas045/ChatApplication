package com.practice.sayani.service;

import com.practice.sayani.model.Message;
import com.practice.sayani.model.User;

import static com.practice.sayani.Main.msgList;

public class MessageHandlerImpl implements MessageHandler {


    @Override
    public void sendMessage(int id, String text, User sender, User reciever ) {
        if(sender.getStatus().equals("online")) {
            if(sender.getMessageLimit()<5) {
                Message m1 = new Message(id, text, sender, reciever);

                msgList.add(m1);
            }
        }else
            System.out.println("sender offline");
    }

    

    @Override
    public void displayMessage(User sender, User reciever) {
        for(Message msg: msgList){
            if(msg.getSender().getName().equals("KK") && msg.getReciever().getName().equals("SD")){
                System.out.println(msg.getMessageText());
            }
        }
    }
}