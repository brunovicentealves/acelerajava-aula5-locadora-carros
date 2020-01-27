package Tests;

import Veiculos.Caminhonete;
import Veiculos.Moto;
import Veiculos.Suv;
import Veiculos.VeiculoComun;
import org.junit.Assert;
import org.junit.Test;

public class TesteVeiculos {

    @Test
    //teste  carro comun
    public void TesteParaVerSeCarroComunRealizaCalculoPorCentagem5Porcento(){

        Integer qtddias= 5 ;

        VeiculoComun veiculoComun = new VeiculoComun();
        Double preco= veiculoComun.CalculaAluguel(qtddias);

        Assert.assertEquals(Double.valueOf(210),preco);

    }

    @Test
    //teste  carro comun
    public void TesteParaVerSeCarroComunRealizaCalculoPorcentagem10Porcento(){

        Integer qtddias = 7;

        VeiculoComun veiculoComun = new VeiculoComun();
        Double preco= veiculoComun.CalculaAluguel(qtddias);

        Assert.assertEquals(Double.valueOf(308),preco);

    }


    @Test
    //teste  carro comun
    public void TesteParaVerSeCarroComunRealizaCalculoPorcentagem20Porcento(){

        Integer qtddias = 12;

        VeiculoComun veiculoComun = new VeiculoComun();
        Double preco= veiculoComun.CalculaAluguel(qtddias);

        Assert.assertEquals(Double.valueOf(576),preco);

    }

    @Test
    //teste classe moto
    public void TesteParaVerSeMotoRealizaCalculoPorcentagem5Porcento(){

        Integer qtddias = 4;

        Moto moto = new Moto();
        Double preco= moto.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(126),preco);

    }

    @Test
    //teste classe moto
    public void TesteParaVerSeMotoRealizaCalculoPorcentagem10Porcento(){

        Integer qtddias = 6;

        Moto moto = new Moto();
        Double preco= moto.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(198),preco);

    }

    @Test
    //teste classe moto
    public void TesteParaVerSeMotoRealizaCalculoPorcentagem20Porcento(){

        Integer qtddias = 12;

        Moto moto = new Moto();
        Double preco= moto.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(432),preco);

    }


    @Test
    // teste classe Suv
    public void TesteParaVerSeSuvRealizaCalculoPorcentagem5Porcento(){

        Integer qtddias = 4;

        Suv suv = new Suv();
        Double preco= suv.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(420),preco);

    }

    @Test
    // teste classe Suv
    public void TesteParaVerSeSuvRealizaCalculoPorcentagem10Porcento(){

        Integer qtddias = 6;

        Suv suv = new Suv();
        Double preco= suv.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(660),preco);

    }

    @Test
    // teste classe Suv
    public void TesteParaVerSeSuvRealizaCalculoPorcentagem20Porcento(){

        Integer qtddias = 12;

        Suv suv = new Suv();
        Double preco= suv.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(1440.0),preco);

    }

    @Test
    //teste classe Caminhonete
    public void TesteParaVerSeCaminhoneteRealizaCalculoPorcentagem5Porcento(){

        Integer qtddias = 4;

        Caminhonete caminhonete = new Caminhonete();
        Double preco= caminhonete.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(336.0),preco);

    }

    @Test
    //teste classe Caminhonete
    public void TesteParaVerSeCaminhoneteRealizaCalculoPorcentagem10Porcento(){

        Integer qtddias = 6;

        Caminhonete caminhonete = new Caminhonete();
        Double preco= caminhonete.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(528.0),preco);

    }

    @Test
    //teste classe Caminhonete
    public void TesteParaVerSeCaminhoneteRealizaCalculoPorcentagem20Porcento(){

        Integer qtddias = 13;

        Caminhonete caminhonete = new Caminhonete();
        Double preco= caminhonete.CalculaAluguel(qtddias);


        Assert.assertEquals(Double.valueOf(1248.0),preco);

    }


}
