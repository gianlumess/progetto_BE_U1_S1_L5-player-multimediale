package entities;

import interfaces.LuminositaSetter;
import interfaces.Shower;

public class Immagine extends ElementoMultimediale implements Shower, LuminositaSetter {
    //ATTRIBUTI
    public int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
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
    public void show() {

    }
}
