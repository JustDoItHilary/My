package com.example.testdesignpatterndemo;

/**
 * Created by Hilary on 2016/8/8.
 *
 */
public class SmsSender implements Sender{
    @Override
    public String send() {
        System.out.println("this is sms!");
        return "this is sms!";
    }
}
