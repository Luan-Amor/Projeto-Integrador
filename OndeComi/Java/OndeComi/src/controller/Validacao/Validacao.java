/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Validacao;
    import ondecomi.model.*;
/**
 *
 * @author Luan Amor
 */
public class Validacao {
    private Avaliador clientes;
    private Restaurantes lugares;

    public Validacao() {
    }

    public Validacao(Avaliador clientes, Restaurantes lugares) {
        this.clientes = clientes;
        this.lugares = lugares;
    }
    
    public Restaurantes retornaLocal(Restaurantes local){
        return local;
    }
    
    public Avaliador retornaAvaliador(Avaliador ava){
        return ava;
    }
}
