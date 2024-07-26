package entities;

import interfaces.LuminositaSetter;
import interfaces.Player;
import interfaces.VolumeSetter;

public class Video extends ElementoMultimediale implements Player, VolumeSetter, LuminositaSetter {
    //ATTRIBUTI
    public int audio;
    public int durata;
    public int luminosita;

    //COSTRUTTORE

    public Video(String titolo, int audio, int durata, int luminosita) {
        super(titolo);
        this.audio = audio;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        luminosita--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Video: " + titolo + "!".repeat(audio) + "*".repeat(luminosita));
        }
    }

    @Override
    public void alzaVolume() {
        audio++;
    }

    @Override
    public void abbassaVolume() {
        audio--;
    }
}
