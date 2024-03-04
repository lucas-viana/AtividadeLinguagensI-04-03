import Casa.Casa;
import Casa.Pessoa;
import Casa.Porta;

public class Main {
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 25;
        Pessoa pessoa = new Pessoa(nome,idade);

        pessoa.imprimeDados();
        pessoa.fazAniversario();

        pessoa.imprimeDados();
        pessoa.fazAniversario();

        pessoa.imprimeDados();
        pessoa.fazAniversario();

        Porta porta = new Porta(false,"roxo",180,60,40);

        porta.estaAberta();
        porta.abre();
        porta.estaAberta();
        porta.fecha();
        porta.estaAberta();

        porta.pinta("azul");
        porta.pinta("amarelo");
        porta.pinta("verde");

        Casa casa = new Casa("Lilas");

        casa.qtdPortasAbertas();
        casa.pinta("Cinza");

    }
}