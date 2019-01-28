package com.stackroute.MuzixApplication.exception;

public class TracNotFoundException extends Exception{
    private String message;
    public TracNotFoundException()
    {

    }
    public TracNotFoundException(String message)
    {
        super(message);
        this.message=message;
    }
}
