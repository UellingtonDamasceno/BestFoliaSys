/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.bfs.model;

import java.util.Objects;

/**
 *
 * @author Uellington Damasceno
 */
/*
    Os metodo gets são responsaveis por devolver o valor de cada atributo de 
    uma determinada instância. 
        Ex: getCpf() é responsavel por pegar o cpf da instância que o chamou. 
    Os metodos sets por sua vez são responsaveis por manipular os valores de 
    um determinado atributo da instância que o chamou. 
        Ex: cpf anterior: 1111111111;
            setCpf(1212121212);
            novo valor do cpf: 1212121212;
*/
public class Foliao {
    private String cpf;
    private String rg;
    private String nome;
    private int idade;
   
    
    public Foliao(String cpf, String rg, String nome, int idade) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * Método responsavel comprarar objetos e indicar se são iguais ou não. 
     * @param obj Objeto a ser comprarado. 
     * @return true se for igual e false caso contrario. 
     */
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
        final Foliao other = (Foliao) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}
