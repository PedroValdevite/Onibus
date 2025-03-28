package Onibus;

public class Passageiro {
    private String nome;
    private String cpf;
    private String email;

    public Passageiro(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static boolean VerificacaoPassageiro(Passageiro passageiro){
        boolean test = false;  
        
        for(Passageiro aux : TelaMenu.passageiros)
        {
           if(aux.getNome().equals(passageiro.getNome()) && aux.getCpf().equals(passageiro.getCpf())) 
           {
               test = true;
           }
        }
        return test;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + '}';
    }
    
    
            
}
