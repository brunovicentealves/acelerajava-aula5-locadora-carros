package Veiculos;

public abstract class Veiculo {

    public abstract Double CalculaAluguel(Integer qtddias);

    protected Double Taxa (Integer qtddias){
        if(qtddias<=5){

            return 0.05;

        }else if (qtddias >=6 && qtddias <=11){

            return 0.1;
        }else{

            return 0.2;
        }
    }
}
