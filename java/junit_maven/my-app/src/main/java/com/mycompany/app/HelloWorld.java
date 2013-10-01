package com.mycompany.app;

/**
 * Created with IntelliJ IDEA.
 * User: brain
 * Date: 10/1/13
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {

    private String message;

    public HelloWorld (String text) {
        this.message = text;
    }

    public String hello() {
        return message;
    }
}
