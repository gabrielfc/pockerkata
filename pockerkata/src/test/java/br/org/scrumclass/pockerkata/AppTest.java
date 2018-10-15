package br.org.scrumclass.pockerkata;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testeComAs() {
    	String [] jogador1 = new String[] {"AD", "3D", "1D", "4D", "7D"};
    	String [] jogador2 = new String[] {"5D", "3D", "1D", "4D", "7D"};
    	assertTrue(Pocker.play(jogador1, jogador2));
    }
    
    @Test
    public void testeComPar() {
    	String [] jogador1 = new String[] {"AD", "3D", "1D", "4D", "7D"};
    	String [] jogador2 = new String[] {"5D", "3D", "1D", "4D", "7D"};
    	assertTrue(!Pocker.play(jogador1, jogador2));
    }
    
    @Test
    public void testeComDoisPares() {
    	String [] jogador1 = new String[] {"AD", "3D", "1D", "4D", "7D"};
    	String [] jogador2 = new String[] {"5D", "3D", "1D", "4D", "7D"};
    	assertTrue(!Pocker.play(jogador1, jogador2));
    }
    
    @Test
    public void testeComTrica() {
    	String [] jogador1 = new String[] {"AD", "3D", "1D", "4D", "7D"};
    	String [] jogador2 = new String[] {"5D", "3D", "1D", "4D", "7D"};
    	assertTrue(!Pocker.play(jogador1, jogador2));
    }
    
    @Test
    public void testeComSequencia() {
    	String [] jogador1 = new String[] {"AD", "3D", "1D", "4D", "7D"};
    	String [] jogador2 = new String[] {"5D", "3D", "1D", "4D", "7D"};
    	assertTrue(!Pocker.play(jogador1, jogador2));
    }
}
