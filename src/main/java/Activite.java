import java.sql.Time;
import java.util.Date;

public class Activite {
    int id = 0;
    String nom = null;
    Date date = null;
    //position géographique, voir GeoTOols
    String description = null;
    int prix = 0;
    Time horaires = null;
    
    public Activite(int id, String nom, Date date, String description, int prix, Time horaires) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.description = description;
        this.prix = prix;
        this.horaires = horaires;
    }

    //surcharger, divers constructeurs?

    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHoraires(Time horaires) {
        this.horaires = horaires;
    }

    public Time getHoraires() {
        return horaires;
    }
} 
