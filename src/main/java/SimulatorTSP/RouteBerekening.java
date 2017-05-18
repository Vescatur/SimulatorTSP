package simulatorTSP;

import java.util.ArrayList;

/**
 * Created by Ivan on 03/05/2017.
 */
public class RouteBerekening {
    private ArrayList<Product> order;
    private AlgoritmeType algoritmeType;
    private ArrayList<Product> route;
    private double berekenTijd;//seconden
    private double lengteRoute;//cm
    private double score;//totale tijd

    public RouteBerekening(ArrayList<Product> order, AlgoritmeType algoritmeType, ArrayList<Product> route, double berekenTijd) {
        this.order = order;
        this.algoritmeType = algoritmeType;
        this.route = route;
        this.berekenTijd = berekenTijd;
        this.lengteRoute = 0;//nog uitzoeken
        this.score = (lengteRoute / berekenTijd);
    }

    public ArrayList<Product> getOrder() {
        return order;
    }

    public AlgoritmeType getAlgoritmeType() {
        return algoritmeType;
    }

    public ArrayList<Product> getRoute() {
        return route;
    }

    public double getBerekenTijd() {
        return berekenTijd;
    }

    public double getLengteRoute() {
        return lengteRoute;
    }

    public double getScore(){
        return score;
    }

    private void CalculateLengteRoute() {
        ArrayList<Locatie> locaties = new ArrayList<Locatie>();
        lengteRoute = 0;
        for (Product product : order) {
            Locatie locatie = product.getLocatie();
            locaties.add(locatie);
        }
        for (int x = 1; x < locaties.size(); x++) {
            lengteRoute = lengteRoute + locaties.get(x).getLengte(locaties.get(x - 1));
        }
        lengteRoute += locaties.get(order.size()).getLengte(locaties.get(0));
    }

}
