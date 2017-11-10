import java.util.Scanner;

public class Adivina {
    private Scanner e1 = new Scanner(System.in);
    private boolean ja = true;

    public void jugar() {
        String n1 = obtenerNombreJugador();

        while (ja) {

            int ti = 0;
            int min = 0;
            int max = 100;
            int numerojuego = obtenerNumero(1,100);

            System.out.println(n1 + "he escogido un numero entre " + min + " y " + max + ", adivinalo");
            int numerojugador;

            do {
                numerojugador = escogerNumero();
                mensaje(numerojuego, numerojugador);
                ti++;
            } while (numerojuego != numerojugador);
            System.out.println("Has ganado " + n1 + " intentos " + ti);

            ja = again();
        }

    }
    private int obtenerNumero(int min, int max){
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    private String obtenerNombreJugador() {
        System.out.println("Hola, cual es tu nombre?");
        String n1 = e1.nextLine();
        System.out.println("biemvenido " +n1 +", vamos a comenzar");
        return n1;
    }
    private int escogerNumero () {
        System.out.println("Escoge un numero");
        return  e1.nextInt();
    }
    private void mensaje(int numeroJuego, int numeroJugador){
        if (numeroJuego < numeroJugador) {
            System.out.println("Muy alto, adivina otra vez");
        } else if (numeroJuego > numeroJugador) {
            System.out.println("Muy bajo, adivina otra vez");
        }
    }
    public boolean again() {
        System.out.println("Jugar nuevamente?\n1. Si\n2. No");
        int respuesta = e1.nextInt();
        if (respuesta == 1){
            System.out.println("Genial, jugemos otra vez");
            return true;
        }else{
            System.out.println("Fin del juego, gracias por participar");
            return false;
        }


    }

    }

