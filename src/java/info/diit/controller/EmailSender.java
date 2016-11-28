/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.controller;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Rana
 */
public class EmailSender {
    public static boolean sendmail(String from, String password, String message, String ename, String mail,String to[]){
        
        String host = "smtp.gmail.com";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
        Session s = Session.getDefaultInstance(props, null);
        MimeMessage mimeMessage =new MimeMessage(s);
        
    
        
        try {
            mimeMessage.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];
            for(int i=0;i<to.length;i++ ){
            toAddress[i]=new InternetAddress(to[i]);
            
            }
            for(int i=0; i<toAddress.length;i++){
            mimeMessage.addRecipient(Message.RecipientType.TO, toAddress[i]);
            
            }
            
                Multipart multipart = new MimeMultipart();

                MimeBodyPart textBodyPart = new MimeBodyPart();
                textBodyPart.setText("your text");
            
            mimeMessage.setSubject("mail using javamail");
            mimeMessage.setText("candidate name:"+ename+"\n"
                    +"candidate's email:"+mail+"\n"+
                    "candidate's cover letter:"+message);
            
           
            
            
            Transport transport = s.getTransport("smtp");
            transport.connect(host,from,password);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();
            return true;
            
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
        
                
        
        return false;
    }
}
