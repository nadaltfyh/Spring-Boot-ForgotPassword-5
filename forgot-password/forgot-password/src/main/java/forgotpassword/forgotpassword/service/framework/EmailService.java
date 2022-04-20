package forgotpassword.forgotpassword.service.framework;

import forgotpassword.forgotpassword.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
