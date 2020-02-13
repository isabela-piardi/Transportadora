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
public class ObtencaoTransportadorOrdenado implements ObtencaoTransportador {

    @Override
    public Transportador obterMenorValor(List<Transportador> lista) {
        Transportador primeiro = lista.get(0);
        return primeiro;

    }

    @Override
    public Transportador obterMaiorValor(List<Transportador> lista) {
        if (lista.size() <= 0) {
            System.out.println("A lista está vazia!");
            return null;
        }
        Transportador ultimo = lista.get(lista.size() - 1);
        return ultimo;

    }

}
