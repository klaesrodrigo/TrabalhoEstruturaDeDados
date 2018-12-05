package br.com.senacrs.lista;

import br.com.senacrs.exception.EmptyListException;

public class Lista<T> implements ListaSimplesmenteEncadeada<T> {

    private NodoSimples<T> primeiro;
    private NodoSimples<T> ultimo;
    private String nome;

    public Lista() {
        this("lista");
    }

    public Lista(String nome) {
        this.nome = nome;
        primeiro = ultimo = null;
    }

    @Override
    public void insereNoFim(T item) {
        if (isVazio()) {
            primeiro = ultimo = new NodoSimples<T>(item);
        } else {
            ultimo = new NodoSimples<T>(ultimo.getDado(), new NodoSimples<>(item));
        }
    }

    @Override
    public void insereNoInicio(T item) {
        if (isVazio()) {
            primeiro = ultimo = new NodoSimples<T>(item);
        } else {
            primeiro = new NodoSimples<T>(item, primeiro);
        }

    }

    @Override
    public void visualizaLista() {
        NodoSimples<T> anterior = primeiro;
        while (true) {
            System.out.println(anterior.getDado());
            if (anterior.prox == null) {
                break;
            }

            
            anterior = anterior.getProx();
        }
    }

    @Override
    public T removeDoInicio() throws EmptyListException {
        if (primeiro == null) {
            return null;
        }

        if (primeiro.getProx() == null) {
            primeiro = null;
            return primeiro.getDado();
        }
        
        NodoSimples<T> retorno = primeiro;
        primeiro = primeiro.prox;
        
        return retorno.getDado();
    }

    public int length() {
        NodoSimples<T> anterior = primeiro;
        int count = 0;

        while (true) {
            if (anterior == null) {
                break;
            }

            count++;
            if (anterior.getProx() == null) {
                break;
            }

            anterior = anterior.getProx();
        }
        return count;
    }

    public T removeDoFim() throws EmptyListException {
        NodoSimples<T> anterior = primeiro;

        if (anterior == null) {
            return null;
        }

        if (anterior.getProx() == null) {
            primeiro = null;
            return anterior.getDado();
        }

        NodoSimples<T> prox = anterior.prox;

        while (true) {

            if (prox.prox == null) {
                ultimo = anterior;
                ultimo.setProx(null);
                break;
            }

            anterior = anterior.getProx();
            prox = anterior.getProx();
        }

        return prox.getDado();
    }
    
    public T removeBy(T obj){
        NodoSimples<T> anterior = primeiro;
        NodoSimples<T> prox = anterior.getProx();
        
        if (anterior == null) {
            return null;
        }
        
        while(true){

            if (anterior == null) {
                break;
            }
            
            if(primeiro.getDado().equals(obj)){
                NodoSimples<T> retorno = primeiro;
                primeiro = primeiro.getProx();
                return retorno.getDado();
            }
            
            if (prox == null) {
                break;
            }
            
            if (prox.getDado().equals(obj)) {
                NodoSimples<T> retorno = prox;
                anterior.setProx(prox.getProx());
                
                return retorno.getDado();
            }         
  
            
            anterior = anterior.getProx();
            prox = anterior.getProx();
        }
        
         return null;
    }
    
    public String retornVisualização(){
        NodoSimples<T> anterior = primeiro;
        String objs = "";
        
        if (anterior == null) {
            return null;
        }
        
        while (true) {
            objs = objs + anterior.getDado() +"\n" ;
            if (anterior.prox == null) {
                break;
            }

            
            anterior = anterior.getProx();
        }
        
        return objs;
    }
    
    

    @Override
    public boolean isVazio() {
        
            return primeiro == null;
        
    }
}
