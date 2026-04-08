package com.example.whatsappbot.service;

import org.springframework.stereotype.Service;

@Service
public class BotService {

    public String getReply(String message) {

        if (message == null || message.isEmpty()) {
            return "Please send valid message";
        }

        message = message.toLowerCase();

        if (message.equals("hi")) {
            return "Hello";
        } else if (message.equals("bye")) {
            return "Goodbye";
        } else {
            return "I don't understand";
        }
    }
}
