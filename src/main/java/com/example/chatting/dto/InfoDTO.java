package com.example.chatting.dto;

import com.example.chatting.constant.Info;

import java.io.Serializable;


public class InfoDTO implements Serializable {

    private String nickName;
    private String message;
    private Info command;

    public String getNickName(){
        return nickName;
    }
    public Info getCommand(){
        return command;
    }
    public String getMessage(){
        return message;
    }
    public void setNickName(String nickName){
        this.nickName= nickName;
    }
    public void setCommand(Info command){
        this.command= command;
    }
    public void setMessage(String message){
        this.message= message;
    }
}
