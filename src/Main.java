import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        crearMatrizCartas();
        Scanner scanner = new Scanner(System.in);
        int opcion;




    }
    public static void crearMatrizCartas(){
        String cartas[][] = new String[11][1];
        for(int fila = 0; fila < 11; fila++){
            if (fila == 0) {
                cartas[fila][0] = "As";
                cartas[fila][1] = "11";
            } else if (fila >= 1 && fila <= 8){
                cartas[fila][0] = "2";
                cartas[fila][1] = "2";
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
        for (int fila = 0; fila < 11; fila++){
            System.out.println("Carta" + cartas[fila][0] + )
        }

}

    public static void agregarCartas(String nombreCarta, String puntaje){

    }
    public static void inicializarCartasJuego(){

    }
    public static void obtenerCartas(){

    }
    public static void jugar(){

    }
}