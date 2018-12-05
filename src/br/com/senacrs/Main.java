package br.com.senacrs;

import br.com.senacrs.estruturasestaticas.Aluno;
import br.com.senacrs.fila.Fila;
import br.com.senacrs.lista.Lista;
import br.com.senacrs.pilha.Pilha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Lista f = new Lista();
        f.insereNoInicio(new Aluno("Rodrigo", "525252"));
        System.out.println(f.length());
        f.insereNoInicio(new Aluno("Klaes", "2523262"));
        System.out.println(f.retornVisualização());
        System.out.println(f.length());
        System.out.println(f.removeBy(new Aluno("Klaes")));
        System.out.println("------------");
        System.out.println(f.retornVisualização());
        System.out.println(f.length());
    }
}
