/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.model;

import dao.BarDao;

/**
 *
 * @author Luan Amor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Buteco";
        String a2 = "Teste";
        float preco = 2;
        float ambiente = 2.5f;
        float n = 3;
        float n2 = 4;
        float n3 = 5;
        
        
        Bar bar = new Bar(a, a2, preco, ambiente, n, n2, n3);
        
        BarDao dao = new BarDao();
        
        //System.out.println(dao.informacoesBar("mais"));
        //dao.addBar(bar);
        //dao.addAvaliaBar(2);
        dao.deleteBar(1);
    }
    
}
