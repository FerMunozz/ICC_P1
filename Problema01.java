/**
 * El programa modifica el camello, le agrega una cola 
 * @author Fernanda Muñoz Arroyo y Ulises Abdiel cabello Cabrera
 * @version 1.0
 * @date 15 ago 2024.           
 */

public class Problema01{
    public static void main(String[] pps){
	String camello;
	
	camello =
	    "               Camello\n" +
	    "                     .--.      .'  `.\n" +
	    "                   .' . :\\    /   :  L\n" +
	    "                   F     :\\  /   . : |        .-._\n" +
	    "                  /     :  \\/        J      .' ___\\\n" +
	    "                 J     :   /      : : L    /--'   ``.\n" +
	    "                 F      : J           |  .<'.o.  `-'>\n" +
	    "                /        J             L \\_>.   .--w)\n" +
	    "               J        /              \\_/|   . `-__|\n" +
	    "               F                        / `    -' /|)\n" +
	    "              |   :                    J   '        |\n" +
	    "             .'   ':                   |    .    :  \\\n" +
	    "            /                          J      :     |L\n" +
	    "           F                              |     \\   ||\n" +
	    "          F .                             |   :      |\n" +
	    "         F  |                             ; .   :  : F\n" +
	    "        /   |                                     : J\n" +
	    "       J    J             )                ;        F\n" +
	    "       |     L           /      .:'                J\n" +
	    "      'F:     L        ./       :: :       .       F\n" +
	    "      `F:     .\\    `:.J         :::.             J\n" +
	    "      J       ::\\    `:|        |::::\\            |\n" +
	    "      J        |:`.    J        :`:::\\            F\n" +
	    "       L   :':/ \\ `-`.  \\       : `:::|        .-'\n" +
	    "       |     /   L    >--\\         :::|`.    .-'\n" +
	    "       J    J    |    |   L     .  :::: :`, /\n" +
	    "        L   F    J    )   |        >::   : /\n" +
	    "        |  J      L   F   \\     .-.:'   . /\n" +
	    "        ): |     J   /     `-   | |   .--'\n" +
	    "        /  |     |: J        L  J J   )\n" +
	    "        L  |     |: |        L   F|   /\n" +
	    "        \\: J     \\:  L       \\  /  L |\n" +
	    "         L |      \\  |        F|   | )\n" +
	    "         J F       \\ J       J |   |J\n" +
	    "          L|        \\ \\      | |   | L\n" +
	    "          J L        \\ \\     F \\   F |\n" +
	    "           L\\         \\ \\   J   | J   L\n" +
	    "          /__\\_________)_`._)_  |_/   \\_____\n" +
	    "                              \"\"   `\"\"\"";
	    // Reemplazando
        String camello1 = camello.replace("      `F:     .\\    `:.J         :::.             J\n",
                                           "    `-`F:     .\\    `:.J         :::.             J\n");
        String camello2 = camello1.replace("      'F:     L        ./       :: :       .       F\n",
                                           "    ,-'F:     L        ./       :: :       .       F\n");
        
        // Imprimimos el final
        System.out.println(camello2);

    }
}