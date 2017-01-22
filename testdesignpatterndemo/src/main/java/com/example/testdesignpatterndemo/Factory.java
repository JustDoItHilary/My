package com.example.testdesignpatterndemo;

/**
 * Created by Hilary on 2016/8/8.
 *
 */
public class Factory {


    public Sender produce(String str) {
        if (str.equals("Sms")) {
            return new SmsSender();
        } else if (str.equals("Mail")) {
            return new MailSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}