package Casa;

import static java.sql.DriverManager.println;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() {
        aberta = true;
    }
    public void fecha() {
        aberta = false;
    }
    public void pinta(String novaCor) {
        cor = novaCor;
        System.out.println("A porta foi pintada na cor"+novaCor);
    }
    public boolean estaAberta() {
        if(aberta){
            System.out.println("Está aberta");
        }
        else System.out.println("Está fechada");
        return aberta;
    }
    public void alteraDimensoes(double dim1, double dim2, double dim3){
        dimensaoX = dim1;
        dimensaoY = dim2;
        dimensaoZ = dim3;
    }
}
