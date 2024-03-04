package Casa;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta(false, "preta", 200, 20, 40);
        this.porta2 = new Porta(false, "cinza", 200, 20, 40);
        this.porta3 = new Porta(false, "branca", 200, 20, 40);
    }

    public void pinta(String novaCor) {
        cor = novaCor;
    }

    public void qtdPortasAbertas() {
        int contador = 0;
        if (porta1.estaAberta()) contador++;
        if (porta2.estaAberta()) contador++;
        if (porta3.estaAberta()) contador++;
        System.out.println(contador);
    }
}

