package br.com.senacrs.estruturasestaticas;

import java.util.Objects;

public class Aluno {
    
    private String nome;
    private String fone;

    public Aluno(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    
        
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + '}';
    }
    
    
}
