/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportadora;

import java.util.List;

/**
 *
 * @author isabela
 */
public class ObtencaoTransportadorComparacao implements ObtencaoTransportador {

    @Override
    public Transportador obterMaiorValor(List<Transportador> lista) {
        Transportador maior = new Transportador();
        maior.setPrecoporkm(Double.MIN_VALUE);

        for (Transportador transportador : lista) {
            maior = (transportador.calculaViagem(10) > maior.calculaViagem(10) ? transportador : maior);
        }
        return maior;
    }

    @Override
    public Transportador obterMenorValor(List<Transportador> lista) {
        Transportador menor = new Transportador();
        menor.setPrecoporkm(Double.MAX_VALUE);

        for (Transportador transportador : lista) {
            menor = (transportador.calculaViagem(10) < menor.calculaViagem(10) ? transportador : menor);

        }
        return menor;
    }

}
