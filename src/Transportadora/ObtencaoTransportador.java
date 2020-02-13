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
public interface ObtencaoTransportador {
    
    public Transportador obterMaiorValor(List<Transportador> lista);
    public Transportador obterMenorValor(List<Transportador> lista);
    
}
