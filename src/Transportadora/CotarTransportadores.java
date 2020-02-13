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
        AgenteDeCotacao p = new AgenteDeCotacao();
        p.preencheLista();
        List<Transportador> lista = p.getLista();

        Transportador t1 = p.obterMaiorValor(lista);
        Transportador t2 = p.obterMenorValor(lista);

        Transportador t3 = p.obterMaiorValor1(lista);
        Transportador t4 = p.obterMenorValor1(lista);

        System.out.println("\n========================== TRANSPORTADOR MAIS CARO ========================== \n" + t1);
        System.out.println("\n========================== TRANSPORTADOR MAIS EM CONTA ========================== \n" + t2);
        System.out.println("\n========================== PRIMEIRO TRANSPORTADOR  ========================== \n" + t4);
        System.out.println("\n========================== ULTIMO TRANSPORTADOR  ========================== \n" + t3);
        System.out.println("\n========================== MEDIA DE PRECOS ========================== \n " + p.obterMediaAritimetica(lista));
        System.out.println("========================== MEIO ========================== \n "+p.obteroMeio(lista));
    }

}
