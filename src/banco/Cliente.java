package banco;

import java.util.Scanner;


public class Cliente {
    public int id;
    public String nome;
    public String cpf;
    public String email;
    public String celular;
    public String senha;
    
    public Cliente (String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    
    public Cliente(){}
    
    public Cliente(String nome){
        this.nome=nome;
        
    }
    
    @Override
    public String toString(){
        return ("\n nome: "
                + this.nome
                + "\n CPF: "
                + this.cpf);
    }

}
