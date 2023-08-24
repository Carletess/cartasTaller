# Cartas
Taller POO
Problema general: Simular un juego de cartas.

1. Cada jugador debe sacar tres cartas de una baraja.
   Se definirá el mazo a usar, en este caso cartas desde el as hasta el kaiser, siendo en total 12 cartas.

Variables a usar en el main:
mazo, será una matriz de 12 filas y 2 columnas.
opcion, sera para el menú.

Principales métodos:
crearMatrizCartas()
agregarCartas(String nombreCarta, String puntaje)
inicializarCartasJuego()
obtenerCartas()
jugar()


2. El objetivo del juego es que un jugador obtenga un puntaje total exacto de 20 puntos con las cartas que haya sacado.
   Para obtener el puntaje total se le deben atribuir los respectivos punatajes a cada carta, las cartas del 2 hasta el 9 tendran un valor
   correspondiente a su número, el as tendrá un valor de 11 y la jota, quina y el kaiser tendran un valor de 10 cada una.
   Luego de esto por cada carta sacada en su respectivo valor se le ira sumando al jugador que sacó la carta.
   Esto se hará con un "for" que irá recorriendo la matriz para obtener una carta y al sacar una carta aleatoria se le sumará
   puntajeJugador1 = 0
   puntajeJugador2 = 0

3. Si ninguno de los dos jugadores obtiene un puntaje exacto de 20 puntos, entonces ganará aquel que haya sacado un puntaje lo más cercano posible a 20, pero sin superarlo.
   Se añadirá un for que esté constantemente revisando el puntaje de los jugadores, si alguno es igual a 20 puntos el juego terminará instantaneamente colocando al jugador con 20 puntos como ganador.

5. Si algún jugador saca un puntaje total que excede los 20 puntos, perderá el juego automáticamente, independientemente del puntaje del otro jugador.
   Se añadirá un for que esté constantemente revisando el puntaje de los jugadores, si alguno supera los 20 puntos el juego terminará instantaneamente colocando al jugador con mas de 20 puntos como perdedor.
