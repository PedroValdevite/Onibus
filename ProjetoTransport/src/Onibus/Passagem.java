/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Onibus;

/**
 *
 * @author pedro
 */
public class Passagem {
    private String origem;
    private String destino;
    private String data;
    private String poltrona;
    private Passageiro passageiro;
    private int ID;

    public Passagem(String origem, String destino, String data, String poltrona, Passageiro passageiro) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.ID = DefinirID();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    
    public int DefinirID(){
        TelaMenu.IDs = TelaMenu.IDs + 1;
        return TelaMenu.IDs;
    }
    
    
    
    
}
