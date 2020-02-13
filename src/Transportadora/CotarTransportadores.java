/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isabela
 */
public class CotarTransportadores {

    public void cotar() {
        AgenteDeCotacao p1 = new AgenteDeCotacao(true);
        AgenteDeCotacao p2 = new AgenteDeCotacao(false);
        p1.preencheLista();
        p2.preencheLista();
        List<Transportador> lista1 = p1.getLista();
        List<Transportador> lista2 = p2.getLista();

        Transportador t1 = p1.obterMaiorValor(lista1);
        Transportador t2 = p1.obterMenorValor(lista1);

        Transportador t3 = p2.obterMaiorValor(lista2);
        Transportador t4 = p2.obterMenorValor(lista2);

        System.out.println("\n========================== TRANSPORTADOR MAIS CARO ========================== \n" + t1);
        System.out.println("\n========================== TRANSPORTADOR MAIS EM CONTA ========================== \n" + t2);
        System.out.println("\n========================== PRIMEIRO TRANSPORTADOR  ========================== \n" + t4);
        System.out.println("\n========================== ULTIMO TRANSPORTADOR  ========================== \n" + t3);
        System.out.println("\n========================== MEDIA DE PRECOS ========================== \n " + p1.obterMediaAritimetica(lista1));
        System.out.println("========================== MEIO ========================== \n " + p2.obteroMeio(lista2));
        
    }

}
