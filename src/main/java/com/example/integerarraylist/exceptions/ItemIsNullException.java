package com.example.integerarraylist.exceptions;

public class ItemIsNullException extends RuntimeException{

    public ItemIsNullException() {
        super("Item might be not null!");
    }
}
