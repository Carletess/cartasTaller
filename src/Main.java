import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        crearMatrizCartas();
        agregarCartas("1", "1", crearMatrizCartas());
    }
    public static void crearMatrizCartas(){
        String cartas[][] = new String[13][2];

        for(int fila = 0; fila < 13; fila++){
            if (fila == 0) {
                cartas[fila][0] = "As";
                cartas[fila][1] = "11";
            } else if (fila == 1){
                cartas[fila][0] = "2";
                cartas[fila][1] = "2";
            } else if (fila >= 1 && fila <= 8){
                cartas[fila][0] = String.valueOf(fila + 1);
                cartas[fila][1] = String.valueOf(fila + 1);
            } else if (fila == 9){
                cartas[fila][0] = "Jota";
                cartas[fila][1] = "10";
            } else if (fila == 10){
                cartas[fila][0] = "Quina";
                cartas[fila][1] = "10";
            } else if (fila == 11){
                cartas[fila][0] = "Kaiser";
                cartas[fila][1] = "10";
            }

        }
        for (int fila = 0; fila < 13; fila++){
            System.out.println("Carta: " + cartas[fila][0] + " Puntaje: " + cartas[fila][1]);
        }

    }

    public static void agregarCartas(String nombreCarta, String puntaje, String cartas[][]){
        int fila = cartas.length;

        if (fila >= 12) {
            System.out.println("Lleno");
            return;
        }

        cartas[fila][0] = nombreCarta;
        cartas[fila][1] = puntaje;

        System.out.println("Se agregó: " + nombreCarta + ", con un puntaje de: " + puntaje);
    }

    public static void inicializarCartasJuego(){

    }
    public static void obtenerCartas(){

    }
    public static void jugar(){

    }
}