/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author isabela
 */
public class AgenteDeCotacao {

    List<Transportador> lista;

    public void preencheLista() {
        lista = new ArrayList<>();
        Random preco = new Random();
        for (int i = 1; i < 11; i++) {
            Transportador t = new Transportador();
            String Fornecedor;
            Fornecedor = "Transportador" + i;
            String Maior;
            String Menor;
            t.setNometransportador(Fornecedor);
            t.setPrecoporkm(preco.nextInt(25));
            lista.add(t);

        }

        Collections.sort(lista, Comparator.comparing(Transportador::getPrecoporkm));
        System.out.println(lista);
    }

    public List<Transportador> getLista() {
        return lista;
    }

    public Transportador obterMenorValor(List<Transportador> lista) {
        Transportador menor = new Transportador();
        menor.setPrecoporkm(Double.MAX_VALUE);

        for (Transportador transportador : lista) {
            menor = (transportador.calculaViagem(10) < menor.calculaViagem(10) ? transportador : menor);

        }
        return menor;

    }

    public Transportador obterMaiorValor(List<Transportador> lista) {
        Transportador maior = new Transportador();
        maior.setPrecoporkm(Double.MIN_VALUE);

        for (Transportador transportador : lista) {
            maior = (transportador.calculaViagem(10) > maior.calculaViagem(10) ? transportador : maior);
        }
        return maior;
    }

    public Transportador obterMenorValor1(List<Transportador> lista) {
        Transportador primeiro = lista.get(0);
        return primeiro;

    }

    public Transportador obterMaiorValor1(List<Transportador> lista) {
        if (lista.size() <= 0) {
            System.out.println("A lista está vazia!");
            return null;
        }
        Transportador ultimo = lista.get(lista.size() - 1);
        return ultimo;

    }

    public double obterMediaAritimetica(List<Transportador> lista) {
        if (lista.size() <= 0) {
            System.out.println("A lista está vazia!");
            return 0;
        }
        double soma = 0;
        Transportador t = new Transportador();
        for (Transportador transportador : lista) {
            soma += transportador.getPrecoporkm();
        }
        return soma / lista.size();
    }

    
    public Transportador obteroMeio(List<Transportador> lista) {
        if (lista.size() <= 0) {
            System.out.println("A lista está vazia!");
            return null;
        }
        
       Transportador meio = lista.get(((lista.size()-1)/2));
       return meio;
        
    }
}
