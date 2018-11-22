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
public class Avaliador {
    
    private int idAvaliador;
    private String nome;

    public Avaliador() {
        
    }
    
    public Avaliador(String nome) {
        this.nome = nome;
    }
   
    public int getIdAvaliador(){
        return idAvaliador;
    }
    
    public void setIdAvaliador(int id){
        this.idAvaliador = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Avaliador{" + "idAvaliador=" + idAvaliador + ", nome=" + nome + '}';
    }

  
    
}
