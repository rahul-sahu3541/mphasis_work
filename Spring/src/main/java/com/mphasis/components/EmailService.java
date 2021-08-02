package com.mphasis.components;

public class EmailService implements MessageService {

    @Override
    public boolean sendMessage(String message, String receiver) {
        System.out.println("Email send to " + receiver + "with the message " + message);
        return true;
    }
}
