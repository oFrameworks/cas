package org.apereo.cas.token.cipher;

import org.apereo.cas.util.cipher.BaseStringCipherExecutor;


/**
 * This is {@link JWTTicketCipherExecutor}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
public class JWTTicketCipherExecutor extends BaseStringCipherExecutor {
    public JWTTicketCipherExecutor() {
        this(null, null, null, false, false, 0, 0);
    }

    public JWTTicketCipherExecutor(final String secretKeyEncryption,
                                     final String secretKeySigning,
                                     final String alg,
                                     final boolean encryptionEnabled,
                                     final boolean signingEnabled,
                                     final int signingKeySize,
                                     final int encryptionKeySize) {
        super(secretKeyEncryption, secretKeySigning, alg, encryptionEnabled, signingEnabled, signingKeySize, encryptionKeySize);
    }


    public JWTTicketCipherExecutor(final String secretKeyEncryption,
                                     final String secretKeySigning,
                                     final String alg,
                                     final boolean encryptionEnabled,
                                     final int signingKeySize,
                                     final int encryptionKeySize) {
        this(secretKeyEncryption, secretKeySigning, alg, encryptionEnabled, true, signingKeySize, encryptionKeySize);
    }

    public JWTTicketCipherExecutor(final String secretKeyEncryption,
                                     final String secretKeySigning,
                                     final boolean encryptionEnabled,
                                     final int signingKeySize,
                                     final int encryptionKeySize) {
        super(secretKeyEncryption, secretKeySigning, encryptionEnabled, signingKeySize, encryptionKeySize);
    }

    public JWTTicketCipherExecutor(final String secretKeyEncryption,
                                     final String secretKeySigning,
                                     final boolean encryptionEnabled,
                                     final boolean signingEnabled,
                                     final int signingKeySize,
                                     final int encryptionKeySize) {
        super(secretKeyEncryption, secretKeySigning, encryptionEnabled, signingEnabled, signingKeySize, encryptionKeySize);
    }

    @Override
    protected String getEncryptionKeySetting() {
        return "cas.authn.token.crypto.encryption.key";
    }

    @Override
    protected String getSigningKeySetting() {
        return "cas.authn.token.crypto.signing.key";
    }

    @Override
    public String getName() {
        return "Token/JWT Tickets";
    }
}
