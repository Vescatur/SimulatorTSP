package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;

/**
 * Created by Ivan on 03/05/2017.
 */
public class Product {
    //VARIABELEN
    private static int idCounter = 0;
    private int id;
    private String naam;
    private Locatie locatie;
    private int hoogte;

    //CONSTRUCTOR
    public Product(String naam, Locatie locatie, int hoogte){
        idCounter++;
        this.id = idCounter;
        this.naam = naam;
        this.locatie = locatie;
        this.hoogte = hoogte;
    }

    //FUNCTIES
    public int getId() { return id; }

    public String getNaam() {
        return naam;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}
