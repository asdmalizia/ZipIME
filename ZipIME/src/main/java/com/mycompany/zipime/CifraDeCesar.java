/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zipime;

/**
 *
 * @author aless
 */
public class CifraDeCesar {
    public static String encode (int key, String text){
        StringBuilder ans = new StringBuilder();
        char letra;
        for(int i = 0; i < text.length(); i++){
            if(!Character.isLetter(text.charAt(i))){
                ans.append(text.charAt(i));
                continue;
            }
            letra = (char) ((int)text.charAt(i) + key);
            
            if((int)letra > 126 )
                letra = (char) ((int)letra - 94);
            
            ans.append(letra);
        }
        return ans.toString();
    }
    
    public static String decode (int key, String text){
        StringBuilder ans = new StringBuilder();
        char data;
        for(int i = 0; i < text.length(); i++){
            data = (char)((int)text.charAt(i) - key);
            if(!Character.isLetter(text.charAt(i))){
                ans.append(text.charAt(i));
                continue;
            }
            
            if((int)data < 32)
                data = (char)((int)data + 94);
            
            ans.append(data);
        }
        return ans.toString();
    }
}
