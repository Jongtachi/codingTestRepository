package test.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AesTest {
    private static final String ALGORITHM = "AES/ECB/NoPadding";
    public static final String KEY = "Cnctengr &@ Naon";

    public static String encrypt(String plainText) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] plainBytes = padString(plainText).getBytes(StandardCharsets.UTF_8);
        byte[] encryptedBytes = cipher.doFinal(plainBytes);

        return bytesToHex(encryptedBytes);
    }

    public static String padString(String source) {
        int blockSize = 16;
        int paddingLength = blockSize - (source.length() % blockSize);
        if (paddingLength == blockSize) {
            return source; // 이미 블록 크기의 배수인 경우 패딩 필요 없음
        }
        StringBuilder sb = new StringBuilder(source);
        for (int i = 0; i < paddingLength; i++) {
            sb.append((char) paddingLength); // 패딩 추가
        }
        return sb.toString();
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    public static String decrypt(String encryptedText) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] encryptedBytes = hexStringToByteArray(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes, StandardCharsets.UTF_8).trim();
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    public static void main(String[] args) {
        try {
            String plainText = "1234567";
            String encryptedText = encrypt(plainText);
            String decryptedText = decrypt(encryptedText);

            System.out.println("Encrypted Text: " + encryptedText);
            System.out.println("Decrypted Text: " + decryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
