package lk.orionux.mailwithattachment;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 3/28/2024
 * @project : mailwithattachment
 */

@Service
public class MailService {

    private JavaMailSender mailSender;

    private  MailProperties mailProperties;

    public void mailWithAttachment(String to, String body, String subject, String filePath )throws MessagingException{
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper help = new MimeMessageHelper(mimeMessage, true);

    }
}
