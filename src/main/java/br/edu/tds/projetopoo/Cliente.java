/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author aluno
 */
public class Cliente {
    //definição de atributos da classe
    public String nome;
    private int idade;
    private String cpf;
 //Definir o(s) meu(s) construtores
    public Cliente(){
    
    }
    public Cliente(String n, int i, String cpf){
        this.nome =n;
        this.idade =i;
        this.cpf =cpf;
    }
    
    //Métods get & set
    
    //Métodos funcionais 
    public void imprimeDadosClientes(){
        System.out.println("nome:" + this.nome);
        System.out.println("idade:" + this.idade);
        System.out.println("cpf:" + this.cpf);
    }
}