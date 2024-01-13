package com.ExposedHost;

public abstract class Substitution implements Cipher {
    public abstract char encrypt(char c);
    public abstract char decrypt(char c);
    @Override
    public String encrypt(String plaintext){
        StringBuilder encodedText = new StringBuilder();
        for(int i=0; i<plaintext.length(); i++){
            char ch = plaintext.charAt(i);
            encodedText.append(encrypt(ch));
        }
        return encodedText.toString();
    }
    @Override
    public String decrypt(String ciphertext){
        StringBuilder decodedText = new StringBuilder();
        for(char i:ciphertext.toCharArray()){
            decodedText.append(decrypt(i));
        }
        return decodedText.toString();
    }
}
