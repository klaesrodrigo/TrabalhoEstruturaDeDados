package br.com.senacrs.fila;

import br.com.senacrs.exception.EmptyListException;

public class Fila<T> {

    private NodoSimples<T> primeiro;
    private NodoSimples<T> ultimo;
    private String nome;

    public Fila() {
        this("lista");
    }

    public Fila(String nome) {
        this.nome = nome;
        primeiro = ultimo = null;
    }

    public void insere(T item) {
        if (isVazio()) {
            primeiro = ultimo = new NodoSimples<T>(item);
        } else {
            primeiro = new NodoSimples<T>(item, primeiro);
        }

    }

    public void visualizaFila() {
        NodoSimples<T> anterior = primeiro;
        while (true) {
            System.out.println(anterior.getDado());
            if (anterior.prox == null) {
                break;
            }

            anterior = anterior.getProx();
        }
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

    public T remove() throws EmptyListException {
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

    public boolean isVazio() {
        return primeiro == null;
    }
}
