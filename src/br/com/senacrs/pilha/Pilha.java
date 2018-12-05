package br.com.senacrs.pilha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.senacrs.exception.EmptyListException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class Pilha<T> {

    private NodoSimples<T> primeiro;
    private NodoSimples<T> ultimo;
    private String nome;
    private NodoSimples<T> topo = null;
    int cont = 0;


    public Pilha() {
        this("pilha");
    }

    public Pilha(String nome) {
        this.nome = nome;
        primeiro = topo = null;
    }


    // Método para empilhar elementos - OK
    public T Empilha (T item){
        System.out.println("\nMÉTODO PARA EMPILHAR NA PILHA:\n");

        if (isEmpty()) {
            primeiro = topo = new NodoSimples<T>(item);
        } else {
            topo = new NodoSimples<T>(item, topo);
        }
        
//        NodoSimples<T> elemento = new NodoSimples<T>(item);;
//        elemento = new NodoSimples<T>(elemento.getDado(), elemento.getProx());
//        topo = elemento;
        
        cont++; 
        System.out.println("Topo: " + topo.getDado());
        System.out.println("Tamanho da pilha: " + cont);
        return (T) topo;
    }

    
    // Método para desempilhar elementos - 
      public T Desempilha() throws EmptyListException {
        if (topo == null) {
            return null;
        }

        if (topo.getProx() == null) {
            NodoSimples<T> retorno = topo;
            topo = null;
            return retorno.getDado();
        }
        
        NodoSimples<T> retorno = topo;
        topo = topo.prox;
        
        return retorno.getDado();
    }
      
    
    // Método para visualizar a pilha - OK
    public void VisualizaPilha() {
        System.out.println("\nMÉTODO VISUALIZA PILHA:\n");
        if(isEmpty()){
            System.out.println("teste");;
        }
        NodoSimples<T> anterior = topo;
        while (true) {
            System.out.println(anterior.getDado());
            if (anterior.prox == null) {
                break;
            }

            anterior = anterior.getProx();
        }
    }
     
      
    // Método para esvaziar pilha - OK
    public void EmptyPilha(){
        System.out.println("\nMÉTODO ESVAZIAR PILHA:\n");
        if (isEmpty()){
            System.out.println("Pilha já está vazia");
        } else{
            topo = primeiro = null;
        }
    }
    

    // Método para verificar se a pilha está vázia - OK
    public boolean isEmpty() {
        System.out.println("\nMÉTODO PARA VERIFICAR TAMANHO DA PILHA:\n");
        if ( topo == null)
            return true;
        else
            return false;
    }
    
}
