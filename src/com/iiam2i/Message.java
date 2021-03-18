package com.iiam2i;

import java.time.LocalDateTime;

public class Message {

    private int id;

    private int state;

    private User receiver;

    private User sender;

    private String content;

    private LocalDateTime date_sent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate_sent() {
        return date_sent;
    }

    public void setDate_sent(LocalDateTime date_sent) {
        this.date_sent = date_sent;
    }

    public String toString(){
        return this.sender.getUsername() + " a écrit : \""+this.content+ "\" ("+this.date_sent.toString()+") à "+this.receiver.getUsername();
    }

}
