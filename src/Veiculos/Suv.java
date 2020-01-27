package Veiculos;

public class Suv extends Veiculo {

    private final Double precoveiculo = 100.00;

    @Override
    public Double CalculaAluguel(Integer qtddias) {
        return (qtddias * precoveiculo)+(qtddias*precoveiculo)*Taxa(qtddias);
    }
}

