/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.bfs.controller;

import br.uefs.ecomp.bfs.model.*;
import br.uefs.ecomp.bfs.util.*;

/**
 *
 * @author Uellington Damasceno
 * Classe necessaria para seguir o Padrão MVC: Model, View e Controller. 
 * Nessa Classe todos os processos de manipulação e gerenciamento de informação
 * do Software. 
 */
public class ControllerBFS {
    private ListaEncadeada folioes;
    private ListaEncadeada blocos;
    int idBloco;
    int idTransporte;
    /**
     * Construtor do ControllerBFS sem argumentos.
     * É responsável por inicializar as listas de folião e blocos. 
     */
    public ControllerBFS() {
        this.folioes = new ListaEncadeada();
        this.blocos = new ListaEncadeada();
    }        
    void setFolioes(ListaEncadeada folioes){
        this.folioes = folioes;
    }
    ListaEncadeada getFolioes(){
        return folioes;
    }
    void setBlocos(ListaEncadeada blocos){
        this.blocos = blocos;
    }
    ListaEncadeada getBlocos(){
        return blocos;
    }
    /*Metodos que se diz respeito aos blocos*/
    /**
     * Método responsavel por cadastrar um novo bloco.
     * 
     * @param nome Nome do bloco. 
     * @param local Local de partida do bloco. 
     * @param saida Horario de saida do bloco.
     * @return Caso o cadastro tenha sido efetuado com sucesso o método irá retronar
     * o bloco cadastrado. caso contrario retornara null.
     */
    public Bloco cadastrarBloco(String nome, String local, int saida){
        Bloco bloco = new Bloco(nome, local, saida);
        bloco.setId(idBloco++);
        if(blocos.estaVazia()){
            blocos.insereInicio(bloco);
        }
        else{
            Iterador lBlocos = blocos.iterador();
            while(lBlocos.temProximo()){
                Bloco blocoObtido = (Bloco) lBlocos.proximo();
                if(blocoObtido.equals(bloco)){
                    return null;
                }
            }         
            blocos.insereFinal(bloco);
        }
        return bloco;
    } 
    /**
     * Método que serve para obter um determinado bloco com base no Id.
     * @param id Utilizado para encontrar o bloco.
     * @return O bloco desejado. caso o bloco não tenha sido encontrado retorna
     * null.
     */
    public Bloco obterBloco(int id) {
        if(blocos.estaVazia()){
            return null;
        }
        else{
            Bloco blocoObtido;
            Iterador blocoAtual = blocos.iterador();
            while(blocoAtual.temProximo()){
                blocoObtido = (Bloco) blocoAtual.proximo();
                if(blocoObtido.getId() == id){
                    return blocoObtido;
                }
            }
            return null;   
        }
    }
    
    /* Metodos que se diz respeito ao folião*/
    /**
     * Método responsavel por cadastrar um novo folião. 
     * 
     * @param cpf Cpf do folião.
     * @param rg Rg do folião.
     * @param nome Nome do folião. 
     * @param idade Idade do folião.
     * @return retorna o folião cadastrado. caso não tenha sido possivel concluir
     * o cadastro o valor null será retornado. 
     */
    public Foliao cadastrarFoliao(String cpf, String rg, String nome, int idade){
        Foliao novoFoliao = new Foliao(cpf, rg, nome, idade);
        if(folioes.estaVazia()){
            folioes.insereInicio(novoFoliao);
        }
        else{
            Iterador lFolioes = folioes.iterador();
            while(lFolioes.temProximo()){
                Foliao foliaoObtido = (Foliao) lFolioes.proximo();
                if(foliaoObtido.equals(novoFoliao)){
                    return null;
                }
            }
            folioes.insereFinal(novoFoliao);
        }
        return novoFoliao;
    }
    /**
     * Este método tem como função pecorrer a lista de foliões (caso exista) compraando
     * o cpf de cada folião com o cpf passado como argumento. ; 
     * 
     * @param cpf Cpf do folião que é desejado ser encontrado
     * @return  Retorna um folião caso não exista será retornado um valor null. 
     */
    public Foliao obterFoliao(String cpf){
        if(folioes.estaVazia()){
            return null;
        }
        else{
            Iterador listaDeFolioes = folioes.iterador();
            Foliao foliaoObtido;
            while(listaDeFolioes.temProximo()){
                foliaoObtido = (Foliao) listaDeFolioes.proximo();
                if(foliaoObtido.getCpf().equals(cpf)){
                    return foliaoObtido;
                }
            }
        }
        return null;
    }
    
    /*Metodos que se diz respeito ao transporte*/
    /**
     * Este método é responsavel por verifica se um novo transporte pode 
     * ser cadastrado, caso seja possivel o novo transporte será cadastrado 
     * no seu respectivo bloco.
     * @param nome Nome do Transporte. 
     * @param tipo Tipo do Transporte. Ex: "Van", "Onibus" ou "Carro".
     * @param valor Valor da passagem.
     * @param capacidade Quantidade de pessoas que o transporte pode acomodar.
     * @param saida Horario de saida do transporte.
     * @param localSaida Local que o transporte vai partir. 
     * @param retorno Horario do retorno. 
     * @param localRetorno Local de encontro dos foliões. 
     * @param chegada Horario de chegada no destido. 
     * @param localChegada Local de destino final. 
     * @param bloco Bloco que o transporte pretende cobrir. 
     * @return Transporte cadastrado. 
     */
    public Transporte cadastrarTransporte(String nome, String tipo, double valor, int capacidade, 
						int saida, String localSaida, int retorno, String localRetorno, 
        					int chegada, String localChegada, Bloco bloco) {
        Transporte transporte = new Transporte(nome, tipo, valor, capacidade, saida, localSaida, retorno, localRetorno, chegada, localChegada, bloco);
        Bloco blocoObtido = obterBloco(bloco.getId());
        if(blocos.estaVazia()){
            return null;
        }
        else if(blocoObtido.getTransportes().estaVazia()){
            blocoObtido.getTransportes().insereInicio(transporte);
        }
        else{
            Iterador lTransporte = blocoObtido.getTransportes().iterador();
            while(lTransporte.temProximo()){
                Transporte transporteObtido = (Transporte) lTransporte.proximo();
                if(transporteObtido.equals(transporte)){
                    return null;
                }
            }
            blocoObtido.getTransportes().insereFinal(transporte);
        }
        transporte.setId(idTransporte++);
        return transporte;
    }
   /**
    * Método responsavel por pecorrer a lista de bloco afim de encontrar 
    * um determinado transporte. 
    * @param id Atributo utilizado como criterio de compração para encontrar o 
    * bloco e o transporte. 
    * @see geraIdTransporte(); 
    * @return Um objeto do tipo transporte que possue um determinado id.
    */
    public Transporte obterTransporte(int id) {
        if(blocos.estaVazia()){
            return null;
        }
        else{
            Iterador lBlocos = blocos.iterador();
            while(lBlocos.temProximo()){
                Bloco blocoObtido = (Bloco)lBlocos.proximo();
                Iterador lTransporte = blocoObtido.getTransportes().iterador();
                while(lTransporte.temProximo()){
                    Transporte transporteObtido = (Transporte)lTransporte.proximo();
                    if(transporteObtido.getId() == id){
                        return transporteObtido;
                    }
                }
            }  
        }
	return null;
    }
    
    /*Metodos que se diz respeito ao Interator*/
    /**
     * Esse método lista todos os blocos de um determinado local e que 
     * tem inicio em determindado período de tempo. 
     * 
     * @param local Utilizado como criterio de verificação para listagem de blocos. 
     * @param dataInicio Valor utilizado como base para compração com o limite 
     * minimo de incio do bloco. 
     * @param dataFim Valor utilizado com base para compração com o limite maximo de
     * inico de bloco.
     * @return 
     */
    public Iterador listarBlocos(String local, int dataInicio, int dataFim) {
        if(blocos.estaVazia()){
            return null;
        }else{
            ListaEncadeada blocosEncontrados = new ListaEncadeada() ;
            Iterador lBlocos = blocos.iterador();
            Bloco bloco;
            while(lBlocos.temProximo()){
                bloco = (Bloco) lBlocos.proximo();
                if(bloco.getLocal().equals(local) && bloco.getSaida() >= dataInicio && bloco.getSaida()<= dataFim) {//condição "quebrada" por causa do tamanho.
                    if(!bloco.getTransportes().estaVazia()){ //Se o bloco possuir algum tranporte ele irá atender aos requisitos.
                        blocosEncontrados.insereFinal(bloco);
                    }
                }
            }
            return blocosEncontrados.iterador();
        }
    }
   /**
    * Método responsável por devolver uma lista de transportes que vai 
    * para um determinado bloco. 
    * @param bloco Atributo que indica qual bloco 
    * @return Um interador da coleção transporte de um determiando bloco.
    */
    public Iterador listarTransportes(Bloco bloco) {
        if(blocos.estaVazia()){
            return null;
        }
        else{
            Bloco blocoObtido = obterBloco(bloco.getId());
            return blocoObtido == null ? null : blocoObtido.getTransportes().iterador();
        }
    }
    
    /**
     * Este método é responsavel por indicar o inicio de uma lista de foliões 
     * de um determinado transporte. 
     * @param transporte
     * @return Um iterador da coleção foliões de um transporte. 
     */
    public Iterador listarFolioes(Transporte transporte) {
        Transporte transporteObtido = obterTransporte(transporte.getId());
        if(blocos.estaVazia()){
            return null;
        }
        else{
            return transporteObtido.getFolioes() == null ? null : transporteObtido.getFolioes().iterador();
        }
    }
    /**
     * Método responsavel por validar e cadastrar um folião em determinado transposte.
     * Essa ação só é possivel se o transporte já estiver devidamente cadastrado
     * em um bloco/destino.
     * @param foliao Objeto da classe Folião que será registrado em transporte.
     * @param transporte Objeto da classe Transporte que s
     * @return true caso folião tenha sido cadastrado false caso não tenha.
     */
    public boolean registrarFoliaoEmTransporte(Foliao foliao, Transporte transporte) {
        Transporte transporteObtido = obterTransporte(transporte.getId());
        if(blocos.estaVazia()){
            return false;
        }
        else if(transporteObtido.getCapacidade() <= transporteObtido.getFolioes().tamanho()){ 
            return false;
        }
        else if(transporteObtido.getFolioes().estaVazia()){
            transporteObtido.getFolioes().insereInicio(foliao);
        }
        else{
            Iterador lFolioes = transporteObtido.getFolioes().iterador();
            while(lFolioes.temProximo()){
                Foliao foliaoObtido = (Foliao) lFolioes.proximo();
                if(foliaoObtido.equals(foliao)){
                    return false;
                }
            }
            transporteObtido.getFolioes().insereFinal(foliao);
        }
        return true;
    }
}
