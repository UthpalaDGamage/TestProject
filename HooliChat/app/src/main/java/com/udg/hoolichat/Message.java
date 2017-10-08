package com.udg.hoolichat;

import java.util.Date;

/**
 * Created by acer on 2017-06-25.
 */

public class Message {
    private String messageText;
    private String messageUser;
    private Long messageTime;

    public Message(String messageText,String messageUser){
        this.messageText=messageText;
        this.messageUser=messageUser;
        messageTime=new Date().getTime();
    }
    public Message(){};

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public Long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Long messageTime) {
        this.messageTime = messageTime;
    }
}
