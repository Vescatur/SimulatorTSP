package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;

/**
 * Created by Ivan on 03/05/2017.
 */
public class RouteBerekening {
    private Order order;
    private AlgoritmeType algoritmeType;
    private Route route;
    private double berekenTijd;//seconden
    private double lengteRoute;//cm
    private double score;//totale tijd

    //Constructor


    public RouteBerekening(Order order, AlgoritmeType algoritmeType, Route route, double berekenTijd) {
        this.order = order;
        this.algoritmeType = algoritmeType;
        this.route = route;
        this.berekenTijd = berekenTijd;
        this.lengteRoute = 0;//nog uitzoeken
        this.score = (lengteRoute / berekenTijd);
    }

    //FUNCTIES
    public Order getOrder() {
        return order;
    }

    public AlgoritmeType getAlgoritmeType() {
        return algoritmeType;
    }

    public Route getRoute() {
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


}
