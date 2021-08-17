

package p1.aplic.cartas;

import java.util.*;
import java.lang.Math.*;


public class Baralho {
  
  protected Vector baralho;

  /**
   * Construtor de um baralho comum.
   */
  public Baralho() {
    // Usa um Vetor para ter um iterador facilmente
    baralho = new Vector();
    // enche o baralho
    for(int valor = menorValor(); valor <= maiorValor(); valor++) {
      for(int naipe = primeiroNaipe(); naipe <= últimoNaipe(); naipe++) {
        // chama criaCarta e não "new" para poder fazer override
        // de criaCarta em baralhos de subclasses e
        // criar classes diferentes.
        baralho.add(criaCarta(valor, naipe));
      }
    }
  }

   //Fazendo a recuperação do valor da menor carta possível deste baralho. em seguida @return O menor valor.
  
  public int menorValor() {
    return Carta.menorValor();
  }

  //Recupera o valor da maior carta possível deste baralho.
  
  
  public int maiorValor() {
    return Carta.maiorValor();
  }
  //   * Recupera o "primeiro naipe" das cartas que podem  no baralho.
   
   
  public int primeiroNaipe() {
    return Carta.primeiroNaipe();
  }

  //Recupera o "último naipe" das cartas que podem estar no baralho.
 
  public int últimoNaipe() {
    return Carta.últimoNaipe();
  }

  // Recupera o número de cartas atualmente no baralho.
  public int númeroDeCartas() {
    return baralho.size();
  }
  
  //  Recupera um iterador para poder varrer todas cartas do baralho.
  
  public Iterator iterator() {
    return baralho.iterator();
  }

  // Baralha (traça) o baralho.
   
  public void baralhar() {
    int posição;
    for(posição = 0; posição < númeroDeCartas() - 1; posição++) {
      // escolhe uma posição aleatória entre posição e númeroDeCartas()-1
      int posAleatória = posição +
                         (int)((númeroDeCartas() - posição) *
                               Math.random());
      // troca as cartas em posição e posAleatória
      Carta temp = (Carta)baralho.get(posição);
      baralho.set(posição, baralho.get(posAleatória));
      baralho.set(posAleatória, temp);
    }
  }

    //Retira uma carta do topo do baralho e a retorna.
     
   
  public Carta pegaCarta() {
    if(númeroDeCartas() == 0) return null;
    return (Carta)baralho.remove(númeroDeCartas()-1);
  }

    private Object criaCarta(int valor, int naipe) {
        throw new UnsupportedOperationException(""); 
    }
}