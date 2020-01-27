package Main;

import Veiculos.Caminhonete;
import Veiculos.Moto;
import Veiculos.Suv;
import Veiculos.VeiculoComun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int opcao = 0;
        do {
            System.out.println("<---------- Locadora de Carros -----------> ");
            System.out.println("Escolha o Veiculo que deseja alugar: ");
            System.out.println("[1]-Carro Comun - Diaria(40.0 Reais)");
            System.out.println("[2]-Moto        - Diaria(30.0 Reais)");
            System.out.println("[3]-SUV         -Diaria(100.0 Reais)");
            System.out.println("[4]-Caminhonete -Diaria(80.0 Reais)");
            System.out.println("[0]-Sair");
            System.out.println("=======>");
            opcao= scanner.nextInt();


            switch (opcao){
                case 1:
                    VeiculoComun veiculoComun = new VeiculoComun();
                    System.out.println("valor Cobrador :"+veiculoComun.CalculaAluguel(qtdDias()));
                    break;
                case 2:
                    Moto moto = new Moto();
                    System.out.println("valor Cobrador :"+moto.CalculaAluguel(qtdDias()));
                    break;
                case 3:
                    Suv suv = new Suv();
                    System.out.println("valor Cobrador :"+suv.CalculaAluguel(qtdDias()));
                    break;
                case 4:
                    Caminhonete caminhonete = new Caminhonete();
                    System.out.println("valor Cobrador :"+caminhonete.CalculaAluguel(qtdDias()));
                    break;
                case 0:
                    System.out.println("Você Esta Saindo do Sistema!");
                    break;
                default:
                    System.out.println("Opcao errada !");
            }
        }while(opcao!=0);


        }
    public static Integer qtdDias(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias :");
        return scanner.nextInt();
    }
    }

