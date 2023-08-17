package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Sirley", "123456789");
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente("João da Silva");

        System.out.println(cli);
        
     
//        System.out.println("nome = " + cli2.nome +"\ncpf = " + cli2.cpf);;
    }

}
