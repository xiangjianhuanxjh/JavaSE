package com.student;

public class UndergraduateException extends Exception{
    String message;
    public UndergraduateException(){
        super();
    }
    public UndergraduateException(String message){
        super(message);
        this.message = message;
    }
    public String warnMess(){
        return message;
    }

}
