package Casa;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario() {
        idade++;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
