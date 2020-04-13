package com.example.demo.Controller;

import com.example.demo.Model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {


    @MessageMapping("/hello")
    @SendTo("/topic/roomId")
    public Message boradCast(Message message){
        return message;
    }
}
