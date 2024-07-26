package entities;

import interfaces.Player;
import interfaces.VolumeSetter;

public class Audio extends ElementoMultimediale implements Player, VolumeSetter {
    //ATTRIBUTI
    public int volume;
    public int durata;

    //COSTRUTTORE
    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    //METODI
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Registrazione audio: " + titolo + "!".repeat(audio));
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        volume--;
    }
}
