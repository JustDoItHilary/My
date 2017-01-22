package com.example.testdesignpatterndemo;

/**
 * Created by Hilary on 2016/8/8.
 *
 */
public class MailSender implements Sender {
    @Override
    public String send() {
        System.out.println("this is mail!");
        return "this is mail";
    }
}
