package com.example.testdesignpatterndemo;

/**
 * Created by Hilary on 2016/8/8.
 *
 */
public class SmsFactory {

    public static Sender produce() {
        return new SmsSender();
    }
}
