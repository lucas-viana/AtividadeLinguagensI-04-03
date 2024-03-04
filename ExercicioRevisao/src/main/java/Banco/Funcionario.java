/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author lucas
 */
public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public String dataDeEntrada;
    public String rg;
    public boolean status;
    
    public Funcionario (String nome, String departamento, double salario, String dataDeEntrada, String rg, boolean status){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataDeEntrada = dataDeEntrada;
        this.rg = rg;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public String getRg() {
        return rg;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString(){
        String statusString;
        if(this.status){
            statusString = "Funcionário Ativo";
        }else statusString = "Funcionario Desativado";
        String format = String.format("%.2f", this.salario);
        return String.format(this.nome+"\n"+format+"\n"+this.rg+"\n"+this.departamento+"\n"+this.dataDeEntrada+"\n"+statusString);

    }
}
