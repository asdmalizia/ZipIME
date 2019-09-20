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
public class HuffmanNode implements Comparable<HuffmanNode> {
    int frequency;
    char data;
    HuffmanNode left, right;
    
    @Override
    public int compareTo(HuffmanNode node){
        return (frequency - node.frequency);
    }
}
