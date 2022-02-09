import java.util.Scanner;

public class WoW {
    public static void main(String[] args) {
        String nomjugador = "";
        int cache = 0;
        int cache1 = 0;
        Boolean bucle = false;
        Scanner key = new Scanner(System.in);

        do {
            System.out.println("Introdueix nom.");
            nomjugador = key.nextLine();
            for(int i = 0 ; i < nomjugador.length()-1 ; i++){
                cache = nomjugador.codePointAt(i);
                cache1 = nomjugador.codePointAt(i+1);
                if (cache != cache1) {
                    bucle = true;
                    System.out.println("Nom Valid");
                    i = nomjugador.length()-1;
                }
                if ((cache == cache1) && (i == nomjugador.length()-2)){
                    System.out.println("Nombre no valid");
                }
            }

        } while (bucle == false);

    }
}
