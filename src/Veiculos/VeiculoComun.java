package Veiculos;

public class VeiculoComun extends Veiculo {
    private final Double precoveiculo = 40.00;

    @Override
    public Double CalculaAluguel(Integer qtddias) {

        return (qtddias * precoveiculo)+(qtddias*precoveiculo)*Taxa(qtddias);
    }


}
