
import java.util.*;

/**
 *
 */
public class chargeDeCours extends enseignant {


    public chargeDeCours(String numem, String numharpege) {
        super(numem, numharpege);
    }


    public void affecterEnseignant(devoir devoir, enseignant ens) {
        devoir.setCorrecteur(ens);
    }


    public void gerrerCours() {
    }


    public void delivrerCertificat() {
        // TODO implement here
    }

}