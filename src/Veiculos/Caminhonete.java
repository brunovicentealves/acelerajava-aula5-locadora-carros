package Veiculos;

public class Caminhonete extends Veiculo {

    private final Double precoveiculo = 80.00;
    @Override
    public Double CalculaAluguel(Integer qtddias) {
        return (qtddias * precoveiculo)+(qtddias*precoveiculo)*Taxa(qtddias);
    }
}
