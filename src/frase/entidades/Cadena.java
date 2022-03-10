package frase.entidades;

import java.util.Scanner;

public class Cadena {

    private String frase;
    private int longitud;
    private String prueba;
    private String prueba1;

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

    public String completarFrase() {
        System.out.println("Ingresa la frase: ");
        String frase = leer.next();
        System.out.println("");

        //System.out.println("La frase ingresada es: " + frase);
        //int longitud = frase.length();
        // System.out.println("La longitud de la frase es " + longitud);
        return frase;
    }

    public int longitudFrase() {
        int longitud = frase.length();
        System.out.println("La longitud de la frase es " + longitud);
        return longitud;
    }

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
                contador++;
            }
        }
        return contador;
    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla
    public StringBuilder invertirFrase() {
        StringBuilder sb = new StringBuilder(frase);
        // Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
        StringBuilder invertida = sb.reverse();
        System.out.println("Frase invertida: " + invertida);
        return invertida;
    }

    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase
    public void vecesRepetido(String frase) {
        System.out.println("Ingrese el caracter a verificar: ");
        String letra = leer.next();
        int pos = 0;
        int contador = 0;
        pos = frase.indexOf(letra);
        while (pos != -1) {
            contador++;
            pos = frase.indexOf(letra, pos + 1);
        }
        System.out.println("El caracter: " + letra + " se repite: " + contador + " veces");
    }

    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario
    public void compararLongitud(String frase) {
        System.out.println("Ingrese la frase a comparar: ");
        String frase1 = leer.next();
        int longitud = frase.length();
        int longitud1 = frase1.length();
        if (longitud > longitud1) {
            System.out.println("La frase " + frase + " tiene " + longitud + " de longitud, es mayor la longitud que la frase " + frase1 + " que tiene " + longitud1 + " de longitud");
        } else if (longitud < longitud1) {
            System.out.println("La frase " + frase + " tiene " + longitud + " de longitud, es menor la longitud que la frase " + frase1 + " que tiene " + longitud1 + " de longitud");
        } else if (longitud == longitud1) {
            System.out.println("La frase " + frase + " tiene " + longitud + " de longitud, es igual la longitud que la frase " + frase1 + " que tiene " + longitud1 + " de longitud");
        }
        //Unir frases
        System.out.println("Las 2 frases unidas quedarían: " + frase + " " + frase1);

    }

    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(String frase) {
        System.out.println("Se reemplazaran todas las letras a, ingrese el caracter que desea: ");
        String caracter = leer.next();
        String nuevafrase = frase.replace("a", caracter);
        System.out.println(nuevafrase);
    }
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    //contains(CharSequence s)
    public void contiene(String frase) {
        System.out.println("Ingrese la letra a comprobar dentro de la cadena: ");
        String letra = leer.next();
        boolean resultado = frase.contains(letra);
        System.out.println("La frase " + frase + " contiene la letra " + letra + " = " + resultado);
    }

    
    
    
}
