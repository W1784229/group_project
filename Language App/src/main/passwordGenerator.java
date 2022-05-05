/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
/**
 *
 * @author W1758597 Rabiul Alam
 */
public class passwordGenerator {
    
     private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#!£&*^";
    private static final  int ITERATIONS = 100;
    private static final int KEY_LENGTH = 256;
    
    
    // generate the user Salt
    
    public String getSalt(int length){
        StringBuilder returnValue = new StringBuilder(length);
        for(int i =0; i<length; i++){
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
           
        }    
             System.out.println("final salt generated: " + returnValue);
        return new String(returnValue);
        }
   
    //Hashing password with salt
    
    
        public  byte[] hash(char[] password, byte[] salt) {
        PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
        Arrays.fill(password, Character.MIN_VALUE);

        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            System.out.println("skf : " + skf);
            System.out.println("");
            System.out.println("skf return to secure password call: " + skf.generateSecret(spec).getEncoded());
            return skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
            System.gc();
        }
        }
        
        
    public  String generateSecurePassword(String password, String salt){
        String returnValue = null;
        System.out.println("password supplied is: " + password + " salt added: " + salt);
        System.out.println("");
        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());
        System.out.println("");
        System.out.println("secure pwd bye[] : " + securePassword);
        System.out.println("");
        returnValue =Base64.getEncoder().encodeToString(securePassword);
        System.out.println("");
        System.out.println("secure pwd converted " + returnValue);
        return returnValue;


    }
    
    
     public boolean verifyUserPassword(String providedPassword, String securedPassword, String salt){
        boolean returnValue = false;

        String newSecurePassword = generateSecurePassword(providedPassword, salt);

        returnValue = newSecurePassword.equalsIgnoreCase(securedPassword);
        return  returnValue;


    }
    
    

        

    }
        
        
        
        
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


