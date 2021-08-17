package p1.aplic.cartas;

import java.util.*;

public class BaralhoTarot extends Baralho {
    /**
     * Cria um baralho de Tarot.
     */
	public BaralhoTarot() {
        super(); // cria minor Arcana
        // cria Major Arcana
		for(int valor = CartaTarot.ONE; valor <= CartaTarot.FOOL; valor++) {
            super.baralho.add(criaCarta(valor, CartaTarot.MAJOR_ARCANA));
        }
    }
//Visão protected
    protected Carta criaCarta(int valor, int naipe) {
        return new CartaTarot(valor, naipe);
    }

    // Recupera o valor da menor carta possível deste baralho.
    
    public int menorValor() {
        return CartaTarot.menorValor();
    }

    // Recupera o valor da maior carta possível deste baralho.
     
    public int maiorValor() {
        return CartaTarot.maiorValor();
    }

    // Recupera o "primeiro naipe" das cartas que podem estar no baralho.
    
    public int primeiroNaipe() {
        return CartaTarot.primeiroNaipe();
    }

    // Recupera o "último naipe" das cartas que podem estar no baralho.
     
    public int últimoNaipe() {
        return CartaTarot.últimoNaipe();
    }
}