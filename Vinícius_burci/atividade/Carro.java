package Vinícius_burci.atividade;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String modelo, String cor, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this. placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
