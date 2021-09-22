
import java.util.*;

/**
 * 
 */
public class devoir {

    private String nom;
    private String description;
    private String deadline;
    private enseignant correcteur;

    public devoir(String nom, String description, String deadline,enseignant correcteur) {
        this.nom = nom;
        this.description = description;
        this.deadline = deadline;
        this.correcteur = correcteur;
    }


    public void setCorrecteur(enseignant correcteur) {
        this.correcteur = correcteur;
    }
}