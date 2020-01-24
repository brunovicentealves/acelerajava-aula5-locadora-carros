package Tests;

import Veiculos.VeiculoComun;
import org.junit.Assert;
import org.junit.Test;

public class TesteVeiculos {

    @Test

    public void TesteParaVerSeRealizaCalculoPorCentagem5Porcento(){

        Integer qtddias= 5 ;

        VeiculoComun veiculoComun = new VeiculoComun();
        Double preco= veiculoComun.CalculaAluguel(qtddias);

        Assert.assertEquals(Double.valueOf(210),preco);

    }
}
