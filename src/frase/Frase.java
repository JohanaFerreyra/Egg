package frase;

import frase.entidades.Cadena;

public class Frase {

    public static void main(String[] args) {

        Cadena c1 = new Cadena();
        
        c1.setFrase(c1.completarFrase());
        
        System.out.println("---- RESULTADOS ---");
        
        int vocales = c1.mostrarVocales(c1.getFrase());

        System.out.println("La cantidad de vocales en la frase es de: " + vocales);
      
        c1.invertirFrase();
        
        c1.vecesRepetido(c1.getFrase());
        
        c1.compararLongitud(c1.getFrase());
        
        c1.reemplazar(c1.getFrase());
        
        c1.contiene(c1.getFrase());
    }

}
