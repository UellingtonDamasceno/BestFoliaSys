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
public class Transporte {
    private int id;
    private String nome;
    private String tipo;
    private double valor;
    private int capacidade;
    private int saida;
    private String localSaida;
    private int retorno;
    private String localRetorno;
    private int chegada; 
    private String localChegada;
    private Bloco bloco;
    private ListaEncadeada folioes;
    /**
     * Consturtor da classe Transporte.
     * 
     * @param nome Nome do transporte.
     * @param tipo Tipo do transporte.
     * @param valor Valor do transporte
     * @param capacidade Quantidade de pessoal que o transporte pode acomodar.
     * @param saida Horario que o transporte irá sair.
     * @param localSaida Ponto de encontro dos foliões para irem ao bloco.
     * @param retorno Horario que o transporte deve voltar ao destino inical.
     * @param localRetorno Ponto de encontro dos foliões para o retorno.
     * @param chegada Horario esperado da chegada ao destino.
     * @param localChegada Local final 
     * @param bloco Bloco que os foliões/transporte desejam/deve ir.
     */
    public Transporte(String nome, String tipo, double valor, int capacidade, int saida, String localSaida, int retorno, String localRetorno, int chegada, String localChegada, Bloco bloco) {
        this.id = 0;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.capacidade = capacidade;
        this.saida = saida;
        this.localSaida = localSaida;
        this.retorno = retorno;
        this.localRetorno = localRetorno;
        this.chegada = chegada;
        this.localChegada = localChegada;
        this.bloco = bloco;   
        this.folioes = new ListaEncadeada();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalSaida() {
        return localSaida;
    }
    
    public Bloco getBloco(){
        return bloco;
    }

    public void setBloco(Bloco bloco){
        this.bloco = bloco;
    }
    
    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }

    public String getLocalRetorno() {
        return localRetorno;
    }

    public void setLocalRetorno(String localRetorno) {
        this.localRetorno = localRetorno;
    }

    public String getLocalChegada() {
        return localChegada;
    }

    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public int getRetorno() {
        return retorno;
    }

    public void setRetorno(int retorno) {
        this.retorno = retorno;
    }

    public int getChegada() {
        return chegada;
    }

    public void setChegada(int chegada) {
        this.chegada = chegada;
    }
    public ListaEncadeada getFolioes(){
        return folioes;
    }
    public void setFolioes(ListaEncadeada folioes){
        this.folioes = folioes;
    }
    /**
     * Método responsavel comprarar objetos e indicar se são iguais ou não. 
     * @param obj Objeto a ser comprarado. 
     * @return true se for igual e false caso contrario. 
     */
    @Override
    public boolean equals(Object obj) {
        final Transporte other = (Transporte) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.capacidade != other.capacidade) {
            return false;
        }
        if (this.saida != other.saida) {
            return false;
        }
        if (this.retorno != other.retorno) {
            return false;
        }
        if (this.chegada != other.chegada) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.localSaida, other.localSaida)) {
            return false;
        }
        if (!Objects.equals(this.localRetorno, other.localRetorno)) {
            return false;
        }
        if (!Objects.equals(this.localChegada, other.localChegada)) {
            return false;
        }
        if (!Objects.equals(this.bloco, other.bloco)) {
            return false;
        }
        return true;
    }
    
}
