
import java.util.*;

/**
 * 
 */
public class admin extends utilisateur {


    public admin() {
    }

    public cours creerCours(String nom, int semestre, enseignant chargerCours) {
        return new cours(nom,semestre,chargerCours);
    }


    public void supprimerCours(cours cours) {
        cours = null;
    }


    public void affecterChargerCours(enseignant ens, cours cours) {
        cours.setChargerCours(ens);
    }

    public void supprimerChargeCours(cours cours) {
        cours.setChargerCours(null);
    }

}