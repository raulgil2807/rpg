package rpg;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

/**
 * Creación de RPG para 1ºDAM
 *
 * @version 6.4
 * @since Visual Studio Code 1.84.2
 * @author Pedro Jesús Gómez Pérez y Raúl Gil Jiménez
 */
public class Main {

    // CREAMOS UNA FUNCIÓN LA CUAL NOS MUESTRA EL MENÚ DEL VIDEOJUEGO
    /**
     *
     * @return
     */
    public static int mostrarMenu() {
        Scanner teclado = new Scanner(System.in);

        // MOSTRAR LAS OPCIONES DEL MENÚ
        System.out.println("*****************     MENU   ******************");
        System.out.println("***********************************************");
        System.out.println("*****************  1. LUCHAR        ***********");
        System.out.println("*****************  2. TIENDA        ***********");
        System.out.println("*****************  3. INVENTARIO    ***********");
        System.out.println("*****************  4. ESTADISTICAS  ***********");
        System.out.println("*****************  5. ABRIR CAJAS   ***********");
        System.out.println("*****************  6. SALIR         ***********");
        System.out.println("***********************************************");
        // MOSTRAR LAS OPCIONES DISPONIBLES EN EL MENÚ
        int opcion = teclado.nextInt(); // OBTENER LA OPCIÓN SELECCIONADA POR EL USUARIO
        return opcion; // NOS DEVUELVE LA OPCIÓN PARA PODER INTRODUCIR DE NUEVO OTRO NÚMERO DIFERENTE.
    }

    // CREAMOS OTRA FUNCIÓN LLAMADA TIENDA, LA CUAL AL ENTRAR NOS DA OPCIONES PARA
    // ELEGIR.
    /**
     *
     */
    public static void tienda() {
        // MOSTRAR OPCIONES DISPONIBLES EN LA TIENDA
        System.out.println("************************       TIENDA       ******************************************");
        System.out.println("**************************************************************************************");
        System.out.println("***************** 1.  Comprar Juggernaut (+1 salud)               *********    20 oros");
        System.out.println("***************** 2.  Comprar carne de rata ( +5 salud - ?ataque) *********   100 oros");
        System.out.println("***************** 3.  Mejorar ataque (15% ataque )                *********   200 oros");
        System.out.println("***************** 4.  Comprar llaves                              *********   300 oros");
        System.out.println("***************** 5.  Volver al MENÚ!!                            ********************");
        System.out.println("*****************        SELECCIONA UN NÚMERO!                    ********************");

    }

    // MENSAJE DE BIENVENIDA Y OBTENCIÓN DEL NOMBRE DEL JUGADOR.
    /**
     *
     * @return
     */
    public static String bienvenida() {
        Scanner teclado = new Scanner(System.in);
        // MOSTRAR MENSAJE DE BIENVENIDA
        System.out.println("***********************************************");
        System.out.println("BIENVENIDO AL DESPERTAR DE LAS SOMBRAS DE MEDAC");
        System.out.println("***********************************************");
        System.out.println("Pulsa enter para continuar...");

        System.out.println("¿Cual es tu nombre viajero?");
        String nombre_usuario = teclado.nextLine(); // OBTENER EL NOMBRE DEL JUGADOR
        // MOSTRAR MENSAJE DE BIENVENIDA PERSONALIZADO
        System.out.println("Encantado de conocerte " + nombre_usuario
                + " ...tome asiento junto al fuego hay mucho de lo que hablar...");
        System.out.println("Pulsa enter para continuar...");
        teclado.nextLine();
        return nombre_usuario;

    }

    // EN ESTA FUNCIÓN IMPRIMIMOS OTRO MENSAJE PERSONALIZADO
    /**
     *
     */
    public static void mensaje() {
        System.out.println("\n");
        System.out.println(
                "TE QUEDAN MUCHAS AVENTURAS POR DELANTE VIAJERO, HA,HA,HA... SELECCIONA LO QUE DESEAS HACER AHORA...SI TE ATREVES");
    }

    // FUNCIÓN PARA SELECCIONAR ORIGEN DEL PERSONAJE
    /**
     *
     * @return
     */
    public static int pueblo() {
        // MOSTRAR OPCIONES DE ORIGEN DEL PERSONAJE
        Scanner teclado = new Scanner(System.in);
        System.out.println("Parece que vienes de muy lejos... ¿Cual es tu origen camarada? ");
        System.out.println("1. Fuerte de los Guerreros de las minas (35 Ataque/10 Salud, 150 oros)");
        System.out.println("2. Aldea de Paladines de luz (20 Ataque/15 Salud, 300 oros)");
        System.out.println("3. Castillo Demoniaco de la Muerte (30 Ataque/ Salud 20, 50 oros)");
        System.out.println("4. Ciudad Botín Elfica (22 Ataque/8 Salud, 500 oros)");
        // MOSTRAR OTROS PUEBLOS DISPONIBLES
        int pueblo = teclado.nextInt(); // OBTENER LA OPCIÓN DE ORIGEN DEL PERSONAJE

        return pueblo;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // CREAMOS LAS ARMAS DEL VIDEOJUEGO
        Armas arma1 = new Armas("El palo abreventanas del Évano", 40);
        Armas arma2 = new Armas("La pierna de PEDROISONOMIKUE", 70);
        Armas arma3 = new Armas("La regleta que peta", 30);
        Armas arma4 = new Armas("Un piti", 20);
        Armas arma5 = new Armas("El rotu gastao", 10);

        // CREAMOS UN RANDOM QUE NOS DÉ VALORES ALEATORIOS
        int random1 = (int) (Math.random() * 40 + 20);
        int random2 = (int) (Math.random() * 20 + 10);
        int random3 = (int) (Math.random() * 35 + 15);
        int random4 = (int) (Math.random() * 70 + 50);
        // CREAMOS LOS ENEMIGOS
        Enemigo enemigo1 = new Enemigo("Javi", random1);
        Enemigo enemigo2 = new Enemigo("Jose", random2);
        Enemigo enemigo3 = new Enemigo("Luis", random3);
        Enemigo enemigo4 = new Enemigo("PEDROISONOMIKUE", random4);
        Enemigo[] enemigos = new Enemigo[4];
        enemigos[0] = enemigo1;
        enemigos[1] = enemigo2;
        enemigos[2] = enemigo3;
        enemigos[3] = enemigo4;

        Scanner entrada = new Scanner(System.in);

        Jugador jugador1 = null; // INICIALIZAR EL JUGADOR

        bienvenida(); // MOSTRAR MENSAJE DE BIENVENIDA

        int numero_pueblos = pueblo(); // SELECCIONAR ORIGEN DEL PERSONAJE

        // CREAR JUGADOR BASADO EN EL ORIGEN SELCCIONADO
        if (numero_pueblos == 1) {
            jugador1 = new Jugador("Guerrero", 10, 35, 150, 5);
            System.out.println(
                    "*********************************************************************************************************");
            System.out.println(
                    "******                                                                                             ******");
            System.out.println(
                    "******  SE APRECIA QUE ERES UN FEROZ GUERRERO DISPUESTO A LA BATALLA!!                               ******");
            System.out.println(
                    "******                                                                                              ******");
            System.out.println(
                    "**********************************************************************************************************");
            System.out.println(
                    "***********     Se te regalarán 5 llaves para que puedas abrir cajas... aprovecha!!!!!        ***********");
        } else if (numero_pueblos == 2) {
            jugador1 = new Jugador("Paladin", 15, 20, 300, 5);
            System.out.println(
                    "********************************************************************************************************");
            System.out.println(
                    "******                                                                                            ******");
            System.out.println(
                    "******              CASI ME CIEGA TU ARMADURA OH MI PALADIN...BRILLAS COMO MI ARCA                ******");
            System.out.println(
                    "******                                                                                            ******");
            System.out.println(
                    "********************************************************************************************************");
            System.out.println(
                    "***********     Se te regalarán 5 llaves para que puedas abrir cajas... aprovecha!!!!!       ***********");
        } else if (numero_pueblos == 4) {
            jugador1 = new Jugador("Elfo", 8, 22, 500, 5);
            System.out.println(
                    "********************************************************************************************************");
            System.out.println(
                    "******                                                                                            ******");
            System.out.println(
                    "******              MENOS MAL QUE AYER MISMO GASTÉ TODO MI ORO!! ELFO GRANUJA JAJA                ******");
            System.out.println(
                    "******                                                                                            ******");
            System.out.println(
                    "********************************************************************************************************");
            System.out.println(
                    "***********     Se te regalarán 5 llaves para que puedas abrir cajas... aprovecha!!!!!       ***********");
        } else if (numero_pueblos == 3) {
            jugador1 = new Jugador("Demonio", 20, 30, 50, 5);
            System.out.println(
                    "*********************************************************************************************************");
            System.out.println(
                    "******                                                                                             ******");
            System.out.println(
                    "******              YA DECÍA YO QUE OLÍA A AZUFRE POR AQUÍ, BIENVENIDO GRAN DEMONIO                ******");
            System.out.println(
                    "******                                                                                             ******");
            System.out.println(
                    "*********************************************************************************************************");
            System.out.println(
                    "***********     Se te regalarán 5 llaves para que puedas abrir cajas... aprovecha!!!!!        ***********");
        }
        // ASGINAR ARMAS AL JUGADOR
        Armas[] armas = new Armas[5];
        armas[0] = arma1;
        armas[1] = arma2;
        armas[2] = arma3;
        armas[3] = arma4;
        armas[4] = arma5;
        // CONTADORES PARA MEJORAS DE ARMAS
        int contador_evano = 0;
        int contador_piti = 0;
        int contador_pierna = 0;
        int contador_rotu = 0;
        int contador_regleta = 0;

        while (true) {

            // MOSTRAR MENSAJE Y OPCIONES AL JUGADOR
            mensaje();
            int opcion = mostrarMenu(); // OBTENER LA OPCIÓN DEL MENÚ
            if (opcion == 4 && jugador1 != null) { // MOSTRAR ESTADÍSTICAS DEL JUGADOR

                System.out.println(jugador1);
            } else if (opcion == 1 && jugador1 != null) { // LUCHAR CONTRA ENEMIGOS
                Scanner teclado = new Scanner(System.in);
                int random5 = (int) (Math.random() * 4);// NO DA VALORES ALEATORIOS DEL JUGADOR
                int random6 = (int) (Math.random() * 5);
                System.out.println("AL ATAQUEEEEEEEEEEEEEEEEEEEEE!!");
                System.out.println("Ha aparecido un enemigo salvaje...¿estarás a su altura? ");

                // ARRAY CON EL RANDOM PARA SACAR AL ENEMIGO ALEATORIO
                int j = random5;
                int k = random6;
                System.out.println("Tienes ante tí : " + "\n" + enemigos[j] + "Con el arma: " + "\n" + armas[k]);
                System.out.println("Reminder de tus stats... " + "\n" + jugador1);
                System.out.println("¿Quieres enfrentarte a esta bestia?");
                System.out.println(
                        "RECOMENDACIÓN!! pasa por la tienda o prueba suerte en las cajas para aumentar tus estadísticas");

                System.out.println(
                        "Recuerda si alcanzas la victoria obtendrás recompensas... pero si pierdes perderás puntos de salud");

                // IMPRIMIMOS LOS VALORES LUCHA Y HUIR.
                System.out.println("1. LUCHAR");
                System.out.println("2. HUIR (- 1 de salud)");
                int opcion_lucha = teclado.nextInt(); // ELEGIMOS LA OPCIÓN UNO PARA QUE PODAMOS LUCHAR CON EL ENEMIGO
                if (opcion_lucha == 1) {
                    Armas arma_elegida = armas[k];
                    Enemigo enemigo_elegido = enemigos[j];

                    // NO DA UN ENEMIGO ALEATORIO EL CUAL NOS DARÁ SU ATAQUE Y SU ARMA.
                    if (jugador1.getAtaque() >= (enemigo_elegido.getAtaque() + arma_elegida.getAtaque())) {
                        int random_oro = (int) (Math.random() * 150 + 1);// OBTIENE EL VALOR DEL ORO QUE RECIBIMOS
                        // ALEATORIAMENTE AL MATAR UN ENEMIGO. ENTRE 1
                        // Y 150.
                        System.out.println(" YOU WIN! has ganado 1 llave y " + random_oro + " oros");
                        jugador1.setKeys(jugador1.getKeys() + 1);// SI GANAMOS RECIBIMOS UNA LLAVE
                        jugador1.setDinero(jugador1.getDinero() + random_oro); // SI GANAMOS RECIBIMOS ORO ALEATORIO.

                        // AUMENTO DE ATAQUE PROGESIVO DE LOS ENEMIGOS A MEDIDA QUE GANAS COMBATES.
                        enemigo1.setAtaque(enemigo1.getAtaque() + 20);
                        enemigo2.setAtaque(enemigo2.getAtaque() + 25);
                        enemigo3.setAtaque(enemigo3.getAtaque() + 30);
                        enemigo4.setAtaque(enemigo3.getAtaque() + 30);

                        // SI EL ARMA RECIBE LA MEJORA MÁXIMA DE NIVEL 10,15,20 LAS ARMAS DE LOS
                        // ENEMIGOS AUMENTARÁN SU ATAQUE DE FORMA EXPONENCIAL.
                        if (contador_evano >= 10 || contador_pierna >= 10 || contador_regleta >= 10
                                || contador_rotu >= 10 || contador_piti >= 10) {
                            arma_elegida.setAtaque(arma_elegida.getAtaque() * 5);
                        } else if (contador_evano >= 15 || contador_pierna >= 15 || contador_regleta >= 15
                                || contador_rotu >= 15 || contador_piti >= 15) {
                            arma_elegida.setAtaque(arma_elegida.getAtaque() * 10);
                        } else if (contador_evano >= 20 || contador_pierna >= 20 || contador_regleta >= 20
                                || contador_rotu >= 20 || contador_piti >= 20) {
                            arma_elegida.setAtaque(arma_elegida.getAtaque() * 15);
                        }

                    } else {
                        System.out.println("YOU LOSEE! -3 de vida pa mi JAJAJAJJA"); // HAS PERDIDO LA BATALLA

                        jugador1.setSalud(jugador1.getSalud() - 3);
                        if (jugador1.getSalud() <= 0) {
                            System.out.println("****************************************");// MENSAJE QUE SE MUESTRA
                            // CUANDO HAS PERDIDO TODAS
                            // LAS VIDAS.
                            System.out.println("**********      GAME OVER     **********");
                            System.out.println("****************************************");
                            break;

                        }
                    }

                } else {
                    // MENSAJE DE HUIDA Y PERDIDA DE 1 PUNTO DE SALUD.
                    System.out.println("****************************************************************************");
                    System.out.println("Has huido con exito... por esta vez, nos quedamos con un punto tuyo de vida!");
                    System.out.println(
                            "Te recomendamos que pases por la tienda o pruebes suerte en las cajas para aumentar tus estadísticas");
                    System.out.println("****************************************************************************");
                    jugador1.setSalud(jugador1.getSalud() - 1);
                }
            } else if (opcion == 2 && jugador1 != null) { // ACCEDER A LA TIENDA Y COMPRAR MEJORAS
                while (true) {
                    tienda();
                    Scanner teclado3 = new Scanner(System.in);
                    int opcion_tienda = teclado3.nextInt();
                    if (opcion_tienda == 1) {
                        if (jugador1.getDinero() >= 20) { // EN CADA COMPRA SE ESTABLECE LAS NUEVAS ESTADISTICAS
                            // ADQUIRIDAS Y SE RESTA EL MONEY.
                            jugador1.setSalud(jugador1.getSalud() + 1);
                            jugador1.setDinero(jugador1.getDinero() - 20);
                        } else {
                            System.out.println("No te quedan oros viajero, vuelve a la lucha o abre cajas");// MUESTRA
                            // MENSAJE
                            // AL NO
                            // TENER MÁS
                            // ORO.
                        }
                    } else if (opcion_tienda == 2) {
                        if (jugador1.getDinero() >= 100) { //
                            jugador1.setSalud(jugador1.getSalud() + 5);
                            jugador1.setAtaque(jugador1.getAtaque() * 95 / 100);
                            jugador1.setDinero(jugador1.getDinero() - 100);
                        } else {
                            System.out.println("No te quedan oros viajero, vuelve a la lucha o abre cajas");
                        }
                    } else if (opcion_tienda == 3) {
                        if (jugador1.getDinero() >= 200) {
                            jugador1.setAtaque(jugador1.getAtaque() * 115 / 100);
                            jugador1.setDinero(jugador1.getDinero() - 200);
                        } else {
                            System.out.println("No te quedan oros viajero, vuelve a la lucha o abre cajas");
                        }
                    } else if (opcion_tienda == 4) {
                        if (jugador1.getDinero() >= 300) {
                            jugador1.setKeys(jugador1.getKeys() + 1);
                            jugador1.setDinero(jugador1.getDinero() - 300);
                        } else {
                            System.out.println("No te quedan oros viajero, vuelve a la lucha o abre cajas");// NO TE
                            // QUEDA NI
                            // UN EURO
                            // PRIMO
                            // (MENSAJE)
                        }
                    } else {
                        System.out.println("SALIENDO DE LA TIENDA...."); // MENSAJE SALIDA DE TIENDA
                        break;
                    }
                }
            } else if (opcion == 3 && jugador1 != null) { // MOSTRAR INVENTARIO Y MEJORAS DE ARMAS.
                System.out.println("****************************************");
                System.out.println("**********     INVENTARIO     **********");
                System.out.println("****************************************");
                System.out.println("El palo abreventanas del Évano -- NIVEL: " + contador_evano);
                if (contador_evano >= 10) {
                    System.out.println("MEJORA LEGENDARIAA"); // MUESTRA MENSAJE AL MEJORAR EL ARMA AL MÁXIMO.

                }

                // IMPRIMIMOS LOS NIVELES QUE OBTIENE CADA ARMA AL TOCARTE REPETIDA EN LAS
                // CAJAS.
                System.out.println("La pierna de PEDROISONOMIKUE -- NIVEL: " + contador_pierna);
                if (contador_pierna >= 10) {
                    System.out.println("MEJORA LEGENDARIAA");
                }
                System.out.println("La regleta que peta -- NIVEL: " + contador_regleta);
                if (contador_regleta >= 10) {
                    System.out.println("MEJORA LEGENDARIAA");
                }
                System.out.println("Un piti -- NIVEL: " + contador_piti);
                if (contador_piti >= 10) {
                    System.out.println("MEJORA LEGENDARIAA");

                }
                System.out.println("El rotu gastao -- NIVEL: " + contador_rotu);
                if (contador_rotu >= 10) {
                    System.out.println("MEJORA LEGENDARIAA");

                }

            } else if (opcion == 5) { // ABRIR CAJAS PARA OBTENER RECOMPENSAS
                Scanner teclado2 = new Scanner(System.in);

                // INICIAMOS EL BUCLE DE ABRIR CAJAS QUE CIERRA CUNDO TE QUEDAS SIN LLAVES O
                // CUANDO PULSAS UN TECLA DISTINTA A 1.
                while (true) {
                    System.out.println("BIENVENIDO A LA APERTURA DE CAJAS!!!!!!");
                    System.out.println("Abrir cajas te costará 1 llave");
                    System.out.println(
                            "Podrás obtener llaves al derrotar enemigos... que los dioses de la fortuna te guien en tu camino");
                    System.out.println("1 PARA ABRIR CAJA, 2 PARA SALIR AL MENU");
                    int opcion_caja = teclado2.nextInt();
                    if (opcion_caja == 1) { // SOLO FUNCIONA EL IF SI DETECTA QUE TIENES AL MENOS UNA LLAVE
                        if (jugador1.getKeys() >= 1) {

                            // COBRAMOS LA LLAVE
                            jugador1.setKeys(jugador1.getKeys() - 1);

                            // CÓDIGO PARA LA APERTURAS DE CAJAS
                            String[] recompensas = { "+100 de dinero", "+50 de dinero", "+20 puntos de ataque",
                                    "+50 puntos de ataque", "El palo abreventanas del Évano",
                                    "La pierna de PEDROISONOMIKUE", "La regleta que peta", "Un piti",
                                    "El rotu gastao" };
                            int random_index = (int) (Math.random() * recompensas.length); // CON EL RANDOM SACAMOS UNO
                            // DE ESTOS OBJETOS O MEJORAS.
                            String recompensa = recompensas[random_index];

                            switch (recompensa) { // RECOMPENSANAS QUE OBTENEMOS AL ABRIR LAS CAJAS, QUE SE NOS MUESTRA
                                // DE FORMA ALEATORIA.
                                case "+100 de dinero":
                                    System.out.println("WOOOW GANASTE 100 OROS");
                                    jugador1.setDinero(jugador1.getDinero() + 100);
                                    break;
                                case "+50 de dinero":
                                    System.out.println("WOOOW GANASTE 50 OROS");
                                    jugador1.setDinero(jugador1.getDinero() + 50);
                                    break;
                                case "+20 puntos de ataque":
                                    System.out.println("WOOOW GANASTE 20 DE ATAQUE");
                                    jugador1.setAtaque(jugador1.getAtaque() + 20);
                                    break;
                                case "+50 puntos de ataque":
                                    System.out.println("WOOOW GANASTE 50 DE ATAQUE");
                                    jugador1.setAtaque(jugador1.getAtaque() + 50); // EXISTE LA POSIBILIDAD DE QUE TE
                                    // TOQUE MÁS DE UNA VEZ EL MISMO
                                    // ARMA. QUE LO QUE HARÁ SERÁ
                                    // UPGRADEARTELA PARA HACER SU DAÑO,
                                    // COMO SI LLEVARAS 2,3,4 O LAS QUE
                                    // SEAN.
                                    break;
                                case "El palo abreventanas del Évano":
                                    System.out.println("WOOOW GANASTE El palo abreventanas del Évano +40 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 40);
                                    contador_evano += 1;
                                    break;
                                case "La regleta que peta":
                                    System.out.println("WOOOW GANASTE La regleta que peta +30 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 30);
                                    contador_regleta += 1;
                                    break;
                                case "Un piti":
                                    System.out.println("WOOOW GANASTE Un piti + 20 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 20);
                                    contador_piti += 1;
                                    break;
                                case "El rotu gastao":
                                    System.out.println("WOOOW GANASTE El rotu gastao + 10 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 10);
                                    contador_rotu += 1;
                                    break;
                                case "La pierna de PEDROISONOMIKUE":
                                    System.out.println("WOOOW GANASTE La pierna de PEDROISONOMIKUE +70 ataque");
                                    jugador1.setAtaque(jugador1.getAtaque() + 70);
                                    contador_pierna += 1;
                                    break;
                            }

                        } else { // SI NO TE TE QUEDAN LLAVES, IMPRIMIMOS QUE VUELVA A LA LUCHA.
                            System.out.println("No te quedan llaves... vuelve a la lucha para conseguir más");
                            break;
                        }
                    } else {
                        break;
                    } // cajas
                }

            } else if (opcion == 6) { // SI SELECCIONAMOS 6 SALIMOS.
                break;
            } else {// SI NO PUES TE HAS EQUIVOCADO.
                System.out.println("Numero equivocado Crack...");
            } // while
        } // while

    }
}
// cierre main// cierre clase
