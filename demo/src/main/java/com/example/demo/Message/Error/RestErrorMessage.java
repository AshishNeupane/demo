package com.example.demo.Message.Error;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.example.demo.Message.RestMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestErrorMessage extends RestMessage {

    @JsonProperty("messages")
    private List<ErrorMessage> errorMessageList;

    public RestErrorMessage(String title,String message)
    {

        this(title,new String[]{message});

    }

    public RestErrorMessage(String message)
    {
        this("Error",new String[]{message});
    }

    public RestErrorMessage(String title,String[] messages)
    {
        setTimeStamp(new Date().getTime());
        setHttpStatus(HttpStatus.OK.value());
        setTitle(title);
        setDetail("Error");
        setDeveloperMessage("Error");
        setPath("");

        errorMessageList = new ArrayList<>();
        for(String message:messages)
        {
            ErrorMessage errorMessage = new ErrorMessage(message);
            errorMessageList.add(errorMessage);
        }
    }
}
