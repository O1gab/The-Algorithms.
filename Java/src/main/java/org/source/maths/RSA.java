package org.source.maths;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
    /**
     * Implementation of the RSA cryptographic algorithm for secure data transmission and encryption
     * More about the algorithm: https://en.wikipedia.org/wiki/RSA_(cryptosystem)
     */
    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulo;

    /**
     * Constructor for the RSA algorithm.
     * @param bitLength the size of the key, specifically the length in bits of the modulus n that's generated during key creation
     */
    public RSA(int bitLength) {
        SecureRandom random = new SecureRandom();

        BigInteger p = new BigInteger(bitLength, 100, random);
        BigInteger q = new BigInteger(bitLength, 100, random);

        // Calculate modulus
        modulo = p.multiply(q);

        // Calculate φ(n)
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        // Choose public exponent e
        publicKey = new BigInteger("65537"); // Commonly used public exponent

        // Calculate private exponent d
        privateKey = publicKey.modInverse(phi);
    }

    public byte[] encrypt(byte[] message) {
        BigInteger encrypted = new BigInteger(message).modPow(publicKey, modulo);
        return encrypted.toByteArray();
    }

    public byte[] decrypt(byte[] encrypted) {
        BigInteger decrypted = new BigInteger(encrypted).modPow(privateKey, modulo);
        return decrypted.toByteArray();
    }

    public static void main(String[] args) {
        RSA rsa = new RSA(1024);

        String originalMessage = "I am using RSA!";
        byte[] encrypted = rsa.encrypt(originalMessage.getBytes());
        byte[] decrypted = rsa.decrypt(encrypted);

        System.out.println("Original message: " + originalMessage);
        System.out.println("Decrypted message: " + new String(decrypted));
    }
}
