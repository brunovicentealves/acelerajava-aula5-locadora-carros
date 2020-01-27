package Veiculos;

public class Moto extends Veiculo {
    private final Double precoveiculo = 30.00;
    @Override
    public Double CalculaAluguel(Integer qtddias) {
        return (qtddias * precoveiculo)+(qtddias*precoveiculo)*Taxa(qtddias);
    }
}
