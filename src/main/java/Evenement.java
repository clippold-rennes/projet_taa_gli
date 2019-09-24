import java.sql.Time;
import java.util.Date;

public class Evenement extends Activite {
    public Evenement(int id, String nom, Date date, String description, int prix, Time horaires) {
        super(id, nom, date, description, prix, horaires);
    }
}
