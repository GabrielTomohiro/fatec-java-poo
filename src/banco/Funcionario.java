package banco;


public class Funcionario {
    public int id;
    public String nome;
    public String cpf;
    public String email;
    public String celular;
    public String senha;
    public double salarioBruto;
    
    public String mostrarDados(){
        return ("/n Nome: " + this.nome + "CPF: " + this.cpf + "Email: " + this.email + "Celular: " + this.celular);
    }
    
    public double calculaSalario(double inss){
        double desc = salarioBruto*inss/100;
        double sl = this.salarioBruto - desc;
        return sl;
        
    }
}
