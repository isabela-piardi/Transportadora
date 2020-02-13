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
public class Transportador {

    public String nometransportador;
    public double precoporkm;
    public double dist;

    public Transportador() {

    }

    public Transportador(String nometransportador, double precoporkm) {
        this.nometransportador = nometransportador;
        this.precoporkm = precoporkm;
    }

    public String getNometransportador() {
        return nometransportador;
    }

    public double getPrecoporkm() {
        return precoporkm;
    }

    public double getDist() {
        return dist;
    }

    public void setNometransportador(String nometransportador) {
        this.nometransportador = nometransportador;
    }

    public void setPrecoporkm(double precoporkm) {
        this.precoporkm = precoporkm;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public String toString() {
        return "\nFonecedor: " + nometransportador + " cobra: " + precoporkm + " reais por km!"; //To change body of generated methods, choose Tools | Templates.
    }

    public Double calculaViagem(double dist) {

        double precoviagem;
        precoviagem = dist * precoporkm;
        return precoviagem;
    }

}
