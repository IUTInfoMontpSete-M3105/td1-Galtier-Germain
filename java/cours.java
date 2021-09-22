
import java.util.*;

/**
 * 
 */
public class cours {
    private String nom;
    private int semestre;
    private enseignant chargerCours;

    public cours(String nom, int semestre, enseignant chargerCours) {
        this.nom = nom;
        this.semestre = semestre;
        this.chargerCours = chargerCours;
    }

    public void setChargerCours(enseignant chargerCours) {
        this.chargerCours = chargerCours;
    }
}