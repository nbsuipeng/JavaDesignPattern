package com.sp.lss.SimpleFactory;

public class PeopleCannotCreateException extends Exception {
    public PeopleCannotCreateException(String message) {
        super(message);
    }
}
