/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Main;

import Banco.Funcionario;
/**
 *
 * @author lucas
 */
public class ExercicioRevisao {

    public static void main(String[] args) {
        String nome = "Lucas";
        String departamento = "T.I";
        double salario = 1500.00;
        String dataDeEntrada = "03/03/2024";
        String rg = "mg123456-78";
        boolean status = true;
        //nome = "Lucas",departamento = "T.I", salario = 1500.00, dataDeEntrada = "03/03/2024", rg = "mg123456-78", status = true
        Funcionario func = new Funcionario(nome,departamento,salario,dataDeEntrada,rg,status);
        System.out.println(func.toString());
        System.out.println("-----------------------x ALTERANDO DADOS x--------------------");
        func.setDepartamento("Estágiario");
        func.setSalario(900.00);
        func.setStatus(false);
        System.out.println(func.toString());
    }
}
