package br.com.senacrs.lista;

import br.com.senacrs.estruturasestaticas.Aluno;

public class NodoSimples<T> {
    private T dado;
    public NodoSimples<T> prox;

    NodoSimples(T dado){
        this(dado,null);
    }
    NodoSimples(T dado, NodoSimples<T> prox){
        this.dado = dado;
        this.prox = prox;
    }
    
    public void setProx(NodoSimples<T> prox) {
        this.prox = prox;
    }

    public T getDado() {
        return dado;
    }

    public NodoSimples<T> getProx() {

        return prox;

    }

    @Override
    public String toString() {
        return "NodoSimples{" + "dado=" + dado + '}';
    }
    
}
