/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.tads.ed.pilha;

/**
 *
 * @author Dextter
 */
public class ExceptionPilhaVazia extends Exception{

    ExceptionPilhaVazia(String pilha_vazia) {
        super(pilha_vazia);
    }
    
}
