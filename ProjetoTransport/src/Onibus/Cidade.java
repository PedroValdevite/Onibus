/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Onibus;

/**
 *
 * @author jairh
 */
public class Cidade {
    private String nome;
    private String codigo;
    private String Uf;

    public Cidade(String nome, String codigo, String Uf) {
        this.nome = nome;
        this.codigo = codigo;
        this.Uf = Uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }
    
    public static boolean VerificacaoCidade(String origem, String destino)
    {
        boolean test = false;
        for(Cidade aux : TelaMenu.cidades)
        {
            if(aux.getNome().equals(origem) && aux.getNome().equals(destino)) 
                {
                    test = true;
                }
        }
        return test;
    }
    
    
}
