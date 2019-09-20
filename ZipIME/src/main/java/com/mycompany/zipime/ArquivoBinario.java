/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zipime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author aless
 */
public class ArquivoBinario {
    
    public static String readFile(String inputFile){
        StringBuilder ans = new StringBuilder();
        try{
            InputStream inputStream = new FileInputStream(inputFile);
            int byteRead = inputStream.read();
            while(byteRead != -1){
                for(int i = 7; i>=0; i--){
                    if(byteRead >> i == 1){
                        ans.append('1');
                        byteRead -= (1 << i);
                    }
                    else{
                       ans.append('0'); 
                    }
                }
                byteRead = inputStream.read();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return ans.toString();
    }
    
    public static void writeFile(String text, String outputFile){
        try{
            OutputStream outputStream = new FileOutputStream(outputFile);
            char data;
            int myByte = 0;
            for(int i = 0; i < text.length(); i++){
                data = text.charAt(i);
                if(data == '1'){
                    myByte += (1 << (7 - (i%8)));
                }
                if(i%8 ==7){
                    outputStream.write(myByte);
                    myByte = 0;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
