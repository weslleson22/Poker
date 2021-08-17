
package p1.aplic.cartas;

import java.util.*;
//Fazendo uso da metodologia Herença
public class BaralhoPoker extends Baralho {
   
    protected CartaPoquer criaCarta(int valor, int naipe) {
        return new CartaPoquer(valor, naipe);
    }

    //Recupera o valor da menor carta possível deste baralho.
     
    public int menorValor() {
        return CartaPoquer.menorValor();
    }

// Recupera o valor da maior carta possível deste baralho.
   
    public int maiorValor() {
        return CartaPoquer.maiorValor();
    }
}