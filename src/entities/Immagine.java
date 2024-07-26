package entities;

import interfaces.LuminositaSetter;
import interfaces.Shower;

public class Immagine extends ElementoMultimediale implements Shower, LuminositaSetter {
    //ATTRIBUTI
    public int luminosita;

    //COSTRUTTORE
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //METODI
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
        System.out.println("Immagine: " + titolo + "*".repeat(luminosita));
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo='" + titolo + '\'' +
                ", luminosita=" + luminosita +
                '}';
    }
}
