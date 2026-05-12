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
public class OnanaReseau {
    private String nom;
    private double freqUplink;
    private double freqDownlink;
    private ArrayList<OnanaBTS> listeBTS;

    public OnanaReseau(String nom, double freqUplink, double freqDownlink) {
        this.nom = nom;
        this.freqUplink = freqUplink;
        this.freqDownlink = freqDownlink;
        this.listeBTS = new ArrayList<>();
    }

    public void ajouterBTS(OnanaBTS b) {
        listeBTS.add(b);
    }

    public int calculerTotalAbonnes() {
        int total = 0;
        for (OnanaBTS b : listeBTS) {
            total += b.getNbAbonnes(); 
        }
        return total;
    }

    public void rechercherLocalisation(String msisdn) {
        for (OnanaBTS b : listeBTS) {
            if (b.rechercherMS(msisdn) != null) {
                System.out.println("L'utilisateur " + msisdn + " est dans la cellule de " + b.toString());
                return;
            }
        }
        System.out.println("Utilisateur non trouvé.");
    }
}
