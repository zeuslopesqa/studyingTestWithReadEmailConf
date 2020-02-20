package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class GetEmailImap {

    public void read(String subject) {
        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        props.put("mail.imap-mail.outlook.com.ssl.enable", "true");
        try {
            Session session = Session.getDefaultInstance(props, null);

            Store storeEmail = session.getStore("imaps");
            storeEmail.connect("imap-mail.outlook.com", "","");
            session.setDebug(true);

            Folder inbox = storeEmail.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.getMessages();
            System.out.println("--------------");

            for(int i = 0; i < messages.length; i++){
                if(messages[i].getSubject().equalsIgnoreCase(subject)){
                  System.out.println("Mail subject" + messages[i].getSubject());}
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
