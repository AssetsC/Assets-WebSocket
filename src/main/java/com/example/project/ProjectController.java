package com.example.project;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.lib.Message;
import com.example.project.lib.MessageUser;
import com.example.project.lib.Table;
import com.example.project.lib.TableUser;



@RestController
public class ProjectController {
	
    @MessageMapping("/{userId}")
    @SendTo("/topic/{userId}")
    public MessageUser Message(@DestinationVariable String userId, MessageUser message) throws Exception {
    	Thread.sleep(1000);
        return message;
    }
    
    @MessageMapping("/table/{table}")
    @SendTo("/topic/table/{table}")
    public Table Message(@DestinationVariable String table, Table val) throws Exception {
    	Thread.sleep(1000);
        return val;
    }
    
    @MessageMapping("/Utable/{table}/{user_id}")
    @SendTo("/topic/Utable/{table}/{user_id}")
    public TableUser MessageTableUser(@DestinationVariable String table , @DestinationVariable int user_id , TableUser val) throws Exception {
    	Thread.sleep(1000);
        return val;
    }
    
    @MessageMapping("/message/{name}")
    @SendTo("/topic/message/{name}")
    public Message storage(@DestinationVariable String name, Message data) throws Exception {
    	Thread.sleep(1000);
        return data;
    }
}
