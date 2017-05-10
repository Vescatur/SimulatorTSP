package simulatorTSP;


/**
 * Created by aaron on 3-5-2017.
 */
public class Locatie {
    //VARIABELEN
    private int x;
    private int y;

    //CONSTRUCTOR
    public Locatie(int x, int y){
    this.x = x;
    this.y = y;
    }

    //FUNCTIES
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public double getLengte(Locatie locatie1){
        return Locatie.getLengte(locatie1,this);
    }

    public static double getLengte(Locatie Locatie1,Locatie Locatie2){
        int xAfstand = Locatie1.getX()-Locatie2.getX();
        int yAfstand = Locatie1.getY()-Locatie2.getY();
        return Math.sqrt(Math.pow(xAfstand,2)+Math.pow(yAfstand,2));
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
