package br.org.scrumclass.pockerkata;

public class Pocker {
	
	static String[] numeroCartas = new String[]{"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
	static String[] naipeCartas = new String[]{"D","H","S","C"};
	
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

	private static int getIndice(String carta) {
		for(int j=0;j<13;j++) {
			String numeroCarta = carta.charAt(0) + "";
			if(numeroCarta.compareTo(numeroCartas[j]) == 0){
				return j;
			}
		}
		return 0;
	}
	
	private static int validaRegraMaiorCarta(String[] jogador1, String[] jogador2) {
		int maiorJogador1 = 0;
		int maiorJogador2 = 0;
		
		for(int i=0;i<jogador1.length;i++) {
			int posicao = getIndice(jogador1[i]);
			if(posicao > maiorJogador1) {
				maiorJogador1 = posicao;
			}
		}
		
		for(int i=0;i<jogador2.length;i++) {
			int posicao = getIndice(jogador2[i]);
			if(posicao > maiorJogador1) {
				maiorJogador2 = posicao;
			}
		}
		
		if(maiorJogador1 > maiorJogador2) {
			return 1;
		} else if(maiorJogador1 < maiorJogador2) {
			return 2;
		}
		
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
