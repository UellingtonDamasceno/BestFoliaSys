/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.bfs.model;

import br.uefs.ecomp.bfs.util.*;
import java.util.Objects;

/**
 *
 * @author Uellington Damasceno
 */
/*
    Os metodo gets são responsaveis por devolver o valor de cada atributo de 
    uma determinada instância. 
        Ex: getId() é responsavel por pegar o Id da instância que o chamou. 
    Os metodos sets por sua vez são responsaveis por manipular os valores de 
    um determinado atributo da instância que o chamou. 
        Ex: id anterior: 0;
            setId(10);
            novo valor do id: 10;
*/
public class Bloco {
    private int id;
    private int saida;
    private String nome;
    private String local;
    private ListaEncadeada transportes;
    /**
     * Construtor da classe Bloco que possui como parâmetro as caracteristica do mesmo. 
     * 
     * @param nome Nome do Bloco.
     * @param local Nome do endereço de partida do Bloco.
     * @param saida Horario que o bloco terá incio.
     */
    public Bloco(String nome, String local, int saida) {
        this.id = 0;
        this.saida = saida;
        this.nome = nome;
        this.local = local;
        this.transportes = new ListaEncadeada();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void setTransportes(ListaEncadeada t){
        this.transportes = t;
    }
    public ListaEncadeada getTransportes(){
        return transportes;
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
        final Bloco other = (Bloco) obj;
      
        if (this.saida != other.saida) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        return true;
    }
}
