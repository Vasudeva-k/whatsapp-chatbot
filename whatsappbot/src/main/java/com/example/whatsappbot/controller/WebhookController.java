package com.example.whatsappbot.controller;

import com.example.whatsappbot.model.MessageRequest;
import com.example.whatsappbot.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private BotService botService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        System.out.println("Incoming message: " + request.getMessage());

        return botService.getReply(request.getMessage());
    }
}
