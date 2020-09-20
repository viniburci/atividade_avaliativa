package Vinícius_burci.atividade;



public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, int telefone){
        super(nome, idade, telefone);
    }

    public Gerente(){
        super();
    }

    @Override
    public String apresentar(){
        return"É um Gerente!!! ";
    }

}
