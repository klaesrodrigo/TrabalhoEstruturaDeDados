package br.com.senacrs.pilha;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class Arquivo {
    public void SalvarArq(){
        Pilha pilha = new Pilha();
        String  topo;
        // Local do arquivo a ser escrito
        Path caminho = Paths.get("/home/klaes/Documentos/caminho");
        // String a ser escrita
        String texto = "Trabalho de Algoritmos e Programação II\n"
                            + "Estruturas de Dados\n"
                            + "Professor Angelo Luz\n"
                            + "Barbearia Samba Cortes\n";
        // Conversão de string para bytes
        byte[] textoByte = texto.getBytes();
        //Escrita do conteudo
        try{
            Files.write(caminho, textoByte);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
