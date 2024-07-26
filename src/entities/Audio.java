package entities;

import interfaces.Player;
import interfaces.VolumeSetter;

public class Audio extends ElementoMultimediale implements Player, VolumeSetter {
    //ATTRIBUTI
    public int audio;
    public int durata;

    public Audio(String titolo, int audio, int durata) {
        super(titolo);
        this.audio = audio;
        this.durata = durata;
    }

    @Override
    public void play() {

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
