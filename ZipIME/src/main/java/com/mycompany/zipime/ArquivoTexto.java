/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zipime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author aless
 */
public class ArquivoTexto {
    public static String readFile(String inputFile){
        //StringBuilder ans = new StringBuilder();
        long fileSize = new File(inputFile).length();
        byte[] allBytes = new byte[(int) fileSize];
        try{
            InputStream inputStream = new FileInputStream(inputFile);
            inputStream.read(allBytes);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return new String(allBytes);
    }
}
