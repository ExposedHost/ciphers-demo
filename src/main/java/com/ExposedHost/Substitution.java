package com.ExposedHost;

public abstract class Substitution implements Cipher {
    public abstract char encrypt(char c);
    public abstract char decrypt(char c);
    @Override
    public String encrypt(String plaintext){
        //TODO: Implement this method
        return "";
    }
    @Override
    public String decrypt(String ciphertext){
        //TODO: Implement this method
        return "";
    }
}
