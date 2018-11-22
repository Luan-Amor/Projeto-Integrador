/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.model;

import ondecomi.model.Avaliacao;
import ondecomi.model.Restaurantes;

/**
 *
 * @author Luan Amor
 */
public class Hamburgueria extends Restaurantes implements Avaliacao{
    private float hamburger;
    private float acompanhamentos;

    public Hamburgueria(String nomeLocal, String endereco, float preco, float ambiente, float atendimento, float hamburger, float acompanhamentos) {
        super(nomeLocal, endereco, preco, ambiente, atendimento);
        this.hamburger = hamburger;
        this.acompanhamentos = acompanhamentos;
    }

    public float alterarAvaliacao(){
        return 0;
    }
    public float avaliarItens(){
        return 0;
    }

    public float getHamburger() {
        return hamburger;
    }

    public void setHamburger(float hamburger) {
        this.hamburger = hamburger;
    }

    public float getAcompanhamentos() {
        return acompanhamentos;
    }

    public void setAcompanhamentos(float acompanhamentos) {
        this.acompanhamentos = acompanhamentos;
    }

    public int getIdRest() {
        return idRest;
    }

    public void setIdRest(int idRest) {
        this.idRest = idRest;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(float ambiente) {
        this.ambiente = ambiente;
    }

    public float getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(float atendimento) {
        this.atendimento = atendimento;
    }

    
}
