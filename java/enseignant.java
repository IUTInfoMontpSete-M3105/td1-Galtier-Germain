
import java.util.*;

/**
 * 
 */
public class enseignant extends utilisateur {

    private String numem;
    private String numharpege;

    public enseignant(String numem, String numharpege) {
        this.numem = numem;
        this.numharpege = numharpege;
    }

    public devoir creerDevoir(String nom, String description, String deadline, enseignant correcteur) {
        return new devoir(nom,description,deadline,correcteur);
    }


    public void saisirNote() {
    }

}