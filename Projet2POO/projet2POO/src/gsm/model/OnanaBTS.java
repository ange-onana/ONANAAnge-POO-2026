/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsm.model;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class OnanaBTS {
    private int numero;
    private String emplacement;
    private String typeMilieu; 
    private int maxUtilisateurs;
    private ArrayList<OnanaMS> utilisateursAttaches;

    public OnanaBTS(int numero, String emplacement, String typeMilieu, int maxUtilisateurs) {
        this.numero = numero;
        this.emplacement = emplacement;
        this.typeMilieu = typeMilieu;
        this.maxUtilisateurs = maxUtilisateurs;
        this.utilisateursAttaches = new ArrayList<>();
    }

    public boolean ajouterMS(OnanaMS mobile) {
        if (utilisateursAttaches.size() < maxUtilisateurs) {
            utilisateursAttaches.add(mobile);
            return true;
        } else {
        System.out.println("BTS " + numero + " saturée !"); 
            return false;
        }
    }

    public void afficherInfos() {
        System.out.println("BTS No: " + numero + " | Lieu: " + emplacement + " | Connectés: " + utilisateursAttaches.size());
    }
    
    public String toString() {
    return "BTS No " + this.numero + " située à " + this.emplacement;
}

    public OnanaMS rechercherMS(String msisdn) {
        for (OnanaMS m : utilisateursAttaches) {
            if (m.msisdn.equals(msisdn)) return m;
        }
        return null;
    }
    
    public int getNbAbonnes() {
        return utilisateursAttaches.size();
    }
}
