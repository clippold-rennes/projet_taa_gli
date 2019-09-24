import java.awt.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Culturel extends Activite {

    Collection collection = new ArrayList();
    //tableaux, morceaux, pièces de théâtres...

    public Culturel(int id, String nom, Date date, String description, int prix, Time horaires, Collection collection) {
        super(id, nom, date, description, prix, horaires);
        this.collection = collection;

    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Collection getCollection() {
        return collection;
    }
}
