package com.qing.utils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

import java.util.ArrayList;
import java.util.List;


public class Email {
    public static void main(String[] args) throws Exception{
      /*  SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.qq.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("1305354640@qq.com", "mdladxibyvlwjghc"));
        email.setSSLOnConnect(true);
        email.setFrom("1305354640@qq.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("1876855154@qq.com");
        email.send();
        System.out.println("发送成功！");*/
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("C:\\Users\\qing\\Pictures\\Camera Roll\\love.jpg");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of LOVE");
        attachment.setName("love.jpg");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.qq.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("1305354640@qq.com", "mdladxibyvlwjghc"));
        email.setSSLOnConnect(true);
        List<String> sendToList=new ArrayList<String>();
        sendToList.add("1876855154@qq.com");
        sendToList.add("1305354640@qq.com");
        for (String s :sendToList  ) {
            email.addTo(s);
        }
        email.setFrom("1305354640@qq.com");
        email.setSubject("The picture");
        email.setMsg("Here is the picture you wanted");

        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();
        System.out.println("发送成功！");
    }
}
