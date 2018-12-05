package br.com.senacrs.lista;

import br.com.senacrs.exception.EmptyListException;

public interface ListaSimplesmenteEncadeada<T> {
    void insereNoFim(T item);

    void insereNoInicio(T item);

    void visualizaLista();

    T removeDoInicio() throws EmptyListException;

    T removeDoFim() throws EmptyListException;

    boolean isVazio();
}
