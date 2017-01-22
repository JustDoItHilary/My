package com.example.testdesignpatterndemo;

/**
 * Created by Hilary on 2016/8/8.
 * 设计模式测试类
 */
public class TestDesign {

    public static String main() throws Exception {

//        Sender sender = new Factory().produce("Sms");
//        Sender sender = new MailFactory().produce();
        Sender sender=SmsFactory.produce();
        String str = sender.send();
        return str;
    }
}
