package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {
    private Triangulo T1;
    private Triangulo T2;

    @Before
    public void Inicializacao() {

        T1 = new Triangulo(2, 3, 4);
        T2 = new Triangulo(0, 0, 0);
    }

    @Test
    public void deveRetornarIlegalParaLadosIguaisAZero() {
        String validadeRetornada = T2.getTipo(T2);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);

    }

    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes(){
        
        String validadeRetornada =  T1.getTipo(T1);
        String validadeEsperada = "Escaleno";
        assertEquals(validadeEsperada,validadeRetornada);
    }
}