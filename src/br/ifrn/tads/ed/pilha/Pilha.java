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
public class Pilha {
    public static final int CapacidadeMax = 1;
    private int Capacidade;
    private Object P[ ];
    private int topo = -1;


    public Pilha() {
        this(CapacidadeMax);
    }

    public Pilha(int tam) {
        Capacidade = tam;
        P = new Object[Capacidade];
    }

    public int size() {
        return(topo + 1);
    }

    public boolean isEmpty() {
        return(topo < 0);
    }
    public void push(Object obj){
        if (size() == Capacidade)           
            dobrarTamanhoDaPilha(Capacidade);
            //throw new ExceptionPilhaCheia("Pilha cheia! Realocando mais espaço...");
        P[++topo] = obj;
    }

    public Object pop() throws ExceptionPilhaVazia {
        Object elemento;
        if (isEmpty())
            throw new ExceptionPilhaVazia("Pilha vazia!");
        elemento = P[topo];
        P[topo] = null; 
        topo--;
        return elemento;
        }
    
    public void dobrarTamanhoDaPilha(int tam){
        tam *= 2;
        Capacidade = tam;
    }
}

