package org.source.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RSATest {
    /**
     * Tests written with JUnit 5.8.1
     */

    @Test
    void testEmptyMessage() {
        // Test with a small key size (128 bits) - an edge case for security
        RSA rsa = new RSA(128);
        String message = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            byte[] encrypted = rsa.encrypt(message.getBytes());
            byte[] decrypted = rsa.decrypt(encrypted);
        });
    }

    @Test
    void testSmallMessage() {
        RSA rsa = new RSA(1024);
        String message = "Test message. Hopefully its gonna pass.";
        byte[] encrypted = rsa.encrypt(message.getBytes());
        byte[] decrypted = rsa.decrypt(encrypted);
        Assertions.assertEquals(message, new String(decrypted));
    }

    @Test
    void testMessage() {
        RSA rsa = new RSA(2048);
        String message = "The idea of an asymmetric public-private key cryptosystem is attributed to Whitfield Diffie and Martin Hellman, who published this concept in 1976. They also introduced digital signatures and attempted to apply number theory.";
        byte[] encrypted = rsa.encrypt(message.getBytes());
        byte[] decrypted = rsa.decrypt(encrypted);
        Assertions.assertEquals(message, new String(decrypted));
    }
}
