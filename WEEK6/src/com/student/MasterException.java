package com.student;

public class MasterException extends Exception{
    String message;
    public MasterException(){
        super();
    }
    public MasterException(String message){
        super(message);
        this.message = message;
    }
    public String warnMess(){
        return message;
    }

}
