package cit59x.hackathon.mental_placeblog.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionUtil {

    private static final String SALT = "ci2t_h0ac2katho3n";

    /**
     * MD5 hash with hex encoding.
     *
     * @param text original text
     * @return hashed text
     */
    private static String md5(String text) {
        return DigestUtils.md5Hex(text);
    }

    /**
     * Transfer user input to hashed password.
     *
     * @param input input
     * @return encoded password
     */
    public static String encrypt(String input) {
        String salted = "" + SALT.charAt(3) + SALT.charAt(9) + input + SALT.charAt(7) + SALT.charAt(4);
        return md5(salted);
    }

    /**
     * Generate and display the encrypted password of user for test.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(encrypt("000000"));
    }
}
