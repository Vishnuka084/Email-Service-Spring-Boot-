package lk.orionux.mailwithattachment;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailwithattachmentApplication {

	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(MailwithattachmentApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		mailService.mailWithAttachment("vishnukayahan708@gmail.com",
				"This is body",
				"Demo mail with attachement",
				"C:\\Users\\ASUS\\Documents\\Spend_Analysis\\March_2024.txt");
	}

}
