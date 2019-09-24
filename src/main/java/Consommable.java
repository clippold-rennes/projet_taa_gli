import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Consommable extends Activite {


    Collection menu = new ArrayList(); //ou string?

    public Consommable(int id, String nom, Date date, String description, int prix, Time horaires, Collection menu) {
        super(id, nom, date, description, prix, horaires);
        this.menu = menu;
    }

    public void setMenu(Collection menu) {
        this.menu = menu;
    }

    public Collection getMenu() {
        return menu;
    }
}
