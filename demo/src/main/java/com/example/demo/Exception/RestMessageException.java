package com.example.demo.Exception;

public class RestMessageException extends Exception{

    public String getTitle() {
        return title;
    }

    private String title;

    public RestMessageException(String msg)
    {
        this("Error",msg);
    }

    public RestMessageException(String title,String msg)
    {
        super(msg);
        this.title = title;
    }


}
