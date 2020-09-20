package Vinícius_burci.atividade;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    
    private String nome;

    private List<Carro> carros = new ArrayList<Carro>();

    Concessionaria (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
