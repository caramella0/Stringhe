import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digita la prima parola: ");
        String prima = s.nextLine() + " ";
        System.out.print("Digita la seconda parola: ");
        String seconda = s.nextLine();

        System.out.println("--------------------------------------");

        confronto(prima, seconda);
        concat(prima, seconda);
        convert(prima, seconda);
        conteggio(prima, seconda);
        sottoString(prima, seconda);
        conteggio(prima, seconda);
        vocali(prima, seconda);
        inverti(prima, seconda);

    }

    public static void confronto(String a, String b) {
        System.out.println("Esegue il confronto");
        System.out.println("Le due parole sono uguali? " + a.equals(b));

        System.out.println("--------------------------------------");

    }

    public static void concat(String a, String b) {
        System.out.println("Esegue la concatenazione");
        String c = a.concat(b);
        System.out.println(a + " e " + b + " concatenate le due parole formano: " + c);
        System.out.println("--------------------------------------");

    }

    public static void convert(String a, String b) {
        System.out.println("Esegue la conversione");
        Scanner s = new Scanner(System.in);

        System.out.print("Vuoi convertire le parole in maiuscolo '1' o in minuscolo '2'? ");
        String scelta = s.nextLine();

        try {
            if (scelta.equals("1")) {
                System.out.println(a.toUpperCase());
                System.out.println(b.toUpperCase());
            } else if (scelta.equals("2")) {
                System.out.println(a.toLowerCase());
                System.out.println(b.toLowerCase());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Scelta non valida!");

        }

    }

    public static void sottoString(String a, String b) {
        Scanner s = new Scanner(System.in);

        String c = a.concat(b);
        String[] split = c.split(" ");
        System.out.print("Digita la parola da trovare: ");
        String primaPar = s.nextLine();

        boolean trovato = false;

        for (String string : split) {
            if (string.equals(primaPar)) {
                trovato = true;
                break;
            }
        }
        if (trovato) {
            System.out.println("La parola è stata trovata!");
        } else {
            System.out.println("La parola non è stata trovata!");
        }
    }


    public static void conteggio(String a, String b) {
        String c = a.concat(b);
        String[] split = c.split(" ");
        String as = c.replace(" ", "");
        char[] ch = as.toCharArray();

        int contParole = 0;
        int contChar = 0;

        for (int i = 0; i < split.length; i++) {
            contParole++;
        }
        for (int j = 0; j < ch.length; j++) {
            contChar++;
        }
        System.out.println("Nella frase ci sono " + contParole + " parole");
        System.out.println("Nella frase ci sono " + contChar + " caratteri senza spazi vuoti");

    }

    public static void vocali(String a, String b) {

        String c = a.concat(b);
        String lowerCase = c.toLowerCase();
        String cancellaSpazi = lowerCase.replace(" ", "");
        char[] charArray = cancellaSpazi.toCharArray();
        char[] vocali = {'a', 'e', 'i', 'o', 'u'};

        boolean trovato = false;
        int char1 = 0;
        int char2 = 0;
        int char3 = 0;
        int char4 = 0;
        int char5 = 0;

        for (char vocaliFor1 : charArray) {
            for (char vocaliFor2 : vocali) {
                if (vocaliFor1 == vocaliFor2) {
                    trovato = true;

                    switch (vocaliFor1) {
                        case 'a':
                            char1++;
                            continue;
                        case 'e':
                            char2++;
                            continue;
                        case 'i':
                            char3++;
                            continue;
                        case 'o':
                            char4++;
                            continue;
                        case 'u':
                            char5++;
                    }
                }
            }
        }
        if (trovato) {
            System.out.println("I caratteri sono stati trovati!");
            System.out.println("a = " + char1);
            System.out.println("e = " + char2);
            System.out.println("i = " + char3);
            System.out.println("o = " + char4);
            System.out.println("u = " + char5);
        } else {
            System.out.println("I caratteri non sono stati trovati!");
        }
    }

    public static void inverti(String a, String b){

    }
}

