package br.org.scrumclass.pockerkata;

public class Pocker {

	public static int play(String[] jogador1, String[] jogador2) {
	    	int resultado = 0;
	    	resultado = validaRegraTrinca(jogador1, jogador2);
	    	if(resultado != 0){
	    	    return resultado;
	    	}
	    	resultado = validaRegraDoisPar(jogador1, jogador2);
	    	if(resultado != 0){
	    	    return resultado;
	    	}
	    	resultado = validaRegraUmPar(jogador1, jogador2);
	    	if(resultado != 0){
	    	    return resultado;
	    	}
	    	return validaRegraMaiorCarta(jogador1, jogador2);
	}

	private static int validaRegraMaiorCarta(String[] jogador1, String[] jogador2) {
	    // TODO Auto-generated method stub
	    return 0;
	}

	private static int validaRegraUmPar(String[] jogador1, String[] jogador2) {
	    // TODO Auto-generated method stub
	    return 0;
	}

	private static int validaRegraDoisPar(String[] jogador1, String[] jogador2) {
	    // TODO Auto-generated method stub
	    return 0;
	}

	private static int validaRegraTrinca(String[] jogador1, String[] jogador2) {
	    // TODO Auto-generated method stub
	    return 0;
	}
}
