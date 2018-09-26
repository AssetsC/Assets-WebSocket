package com.example.project.lib;

import lombok.Data;

@Data
public class MessageUser {

    private int user_id;
    private String name;
    private String content;
    private String path;
    private boolean readed;
    
}
