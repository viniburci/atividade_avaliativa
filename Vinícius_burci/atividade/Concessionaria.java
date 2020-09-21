package Vinícius_burci.atividade;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    
    private String nome;

    private Gerente gerente;
    private List<Carro> carros = new ArrayList<Carro>();
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    Concessionaria (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getGerente() {
        return gerente.getNome() + gerente.getIdade() + gerente.getTelefone();
    }

    public String apresentaGerente(){
        if(gerente == null){
            return "Concessionaria não tem gerente!!";
        }
        return "Concessionaria: "+ nome + ", Gerente: " + gerente.getNome();
    }

    public void addCarro(Carro novo){
        this.carros.add(novo);
    }

    public String mostraCarros(){
        String stringCarros = "carros=[";
        for (Carro c : this.carros) {
            stringCarros += c.toString() + ",";
        }
        return "Concessionaria [nome=" + nome + "," + stringCarros + "]";
    }

    public void addFuncionario(Funcionario novo){
        this.funcionarios.add(novo);
    }

    public String mostraFuncionarios(){
        String stringFuncionarios= "funcionarios=[";
        for (Funcionario f : this.funcionarios) {
            stringFuncionarios += f.getNome() + ",";
        }
        return "Concessionaria [nome=" + nome + "," + stringFuncionarios + "]]";
    }


}
