package Vinícius_burci.atividade;



public class AppAtividade {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario("joao", 20, 999999999);
        Funcionario pedro = new Funcionario();
        Gerente marcello = new Gerente("marcello", 35, 888888888);
        
        pedro.setNome("pedro");
        System.out.println(pedro.getNome());
        System.out.println(joao.getIdade());

        pedro.setNome("felipe");
        System.out.println(pedro.getNome());
        System.out.println(joao);
        //joao.apresentar();
        //joao.setTelefone(12345678);
        System.out.println(joao.apresentar());
        System.out.println(marcello.apresentar());
        //marcello.setIdade(-2);
    }
}

