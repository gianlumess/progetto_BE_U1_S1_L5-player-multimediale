import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creo array di 5 elementi multimediali
        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

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
            }
        }
    }
}