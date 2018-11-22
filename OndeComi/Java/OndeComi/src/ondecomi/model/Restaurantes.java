/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.model;

/**
 *
 * @author Luan Amor
 */
public abstract class Restaurantes {
   
    protected int idRest;
    protected String nomeLocal;
    protected String endereco;
    protected float preco;
    protected float ambiente;
    protected float atendimento;


    public Restaurantes(String nomeLocal, String endereco, float preco, float ambiente, float atendimento) {
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
        this.preco = preco;
        this.ambiente = ambiente;
        this.atendimento = atendimento;
    }
    
    public Restaurantes(String nome, String end){
        this.nomeLocal = nome;
        this.endereco = end;
        this.preco = 0;
        this.ambiente = 0;
        this.atendimento = 0;
  
    }
    
    
    
    
}
