package com.customerManagement.CustomerManagement.Exceptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(){
        super();
    }

    public CustomerNotFoundException(String s){
        super(s);
    }
}
