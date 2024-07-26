import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creo array di 5 elementi multimediali
        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

        //ciclo 5 volte, ovvero la lunghezza dell'array creato ed inserisco gli elementi all'inerno
        for (int i = 0; i < 5; i++) {
            System.out.println("Scegli che elemento multimediale inserire:");
            System.out.println("1: Immagine");
            System.out.println("2: Registrazione audio");
            System.out.println("3: Video");

            int sceltaUtente = Integer.parseInt(scanner.nextLine());

            System.out.println("Inserisci Titolo: ");
            String titolo = scanner.nextLine();

            switch (sceltaUtente) {
                case 1:
                    System.out.println("Inserisci luminosità: ");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    elementiMultimediali[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                case 2:
                    System.out.println("Inserisci durata: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci volume: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    elementiMultimediali[i] = new Audio(titolo, volumeAudio, durataAudio);
                    break;
                case 3:
                    System.out.println("Inserisci durata: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci luminosità: ");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    elementiMultimediali[i] = new Video(titolo, volumeVideo, durataVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Devi selezionare una delle 3 alternative");
                    i--; //riduco l'indice del ciclo for per non andare avanti in caso di errore e quindi lasciare uno spazio vuoto nell'array
                    break;
            }
        }

        int sceltaEsecuzione = -1;
        while (sceltaEsecuzione != 0) {
            System.out.println("Scegli quale elemento eseguire tra 1 e 5, oppure inserisci 0 per uscire: ");
            System.out.println(Arrays.toString(elementiMultimediali));
            sceltaEsecuzione = Integer.parseInt(scanner.nextLine());
            if (sceltaEsecuzione >= 1 && sceltaEsecuzione <= 5) {
                ElementoMultimediale elemento = elementiMultimediali[sceltaEsecuzione - 1]; //selezione elemento nell'array in base alla scelta dell'utente
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Audio) {
                    ((Audio) elemento).play();
                } else if (elemento instanceof Video) {
                    ((Video) elemento).play();
                }
            }
        }
        scanner.close();
    }
}