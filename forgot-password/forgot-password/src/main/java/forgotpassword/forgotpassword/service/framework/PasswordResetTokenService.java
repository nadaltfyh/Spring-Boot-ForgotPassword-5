package forgotpassword.forgotpassword.service.framework;

import forgotpassword.forgotpassword.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
