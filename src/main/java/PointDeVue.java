import java.sql.Time;
import java.util.Date;

public class PointDeVue extends Activite {

    public PointDeVue(int id, String nom, Date date, String description, Time horaires) {
        super(id, nom, date, description, 0, horaires);
    }
    public PointDeVue(int id, String nom, Date date, String description) {
        super(id, nom, date, description, 0, null);
    }
}
