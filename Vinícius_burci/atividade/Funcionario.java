package Vinícius_burci.atividade;


public class Funcionario {
        
        private String nome;
        private int idade;
        private int telefone;

        public Funcionario(String nome, int idade, int telefone) {
            this.nome = nome;
            if(idade <= 0){
                throw new RuntimeException("Idade nao pode ser negativo!");
            }
            this.idade = idade;
            this.telefone = telefone;
        }

		public Funcionario() {

        }
        
        public int getIdade() {
            return idade;
        }

        public String getNome() {
            return nome;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setIdade(int idade) {
            if(idade <= 0){
                throw new RuntimeException("Idade nao pode ser negativo!");
            }
            this.idade = idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        public String apresentar(){
            return"É um Funcionário!!!!";
        }

}
