/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zipime;

import java.util.Scanner;

/**
 *
 * @author aless
 */
public class ZipIME {
    public static void main(String[] args) {
        System.out.println("Entre com o nome do arquivo sem a extensão (ex. meuarquivo.txt --> meuarquivo): ");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        String inputFile = path + ".txt";
        
        System.out.println("Entre com o valor da chave: ");
        int key = s.nextInt();
        
        //codificação
        String text = ArquivoTexto.readFile(inputFile);
        text = CifraDeCesar.encode(key, text);
        text = Huffman.encode(text);
        //System.out.println(text);
        String outputFile = path + ".bin";
        ArquivoBinario.writeFile(text, outputFile);
        
        text = ArquivoBinario.readFile(outputFile);
        text = Huffman.decode(text);
        text = CifraDeCesar.decode(key, text);
        
        System.out.println(text);
        
        //C:\Users\aless\OneDrive\Documentos\LabProg
    }
    
}
