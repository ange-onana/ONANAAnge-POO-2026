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
    public class OnanaMS implements AppareilConnecte{
        
   
    protected String nom;
    protected String prenom;
    private String motDePasse;
    protected String msisdn; 
    protected String imsi;   
    private ArrayList<String> appelsRecus; 

    public OnanaMS(String nom, String prenom, String motDePasse, String msisdn, String imsi) {
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.msisdn = msisdn;
        this.imsi = imsi;
        this.appelsRecus = new ArrayList<>();
    }

    public void afficherCaracteristiques() {
        System.out.println("MS: " + nom + " " + prenom + " | No: " + msisdn);
    }

    public void recevoirAppel(String numeroAppelant) {
        appelsRecus.add(numeroAppelant);
        System.out.println(msisdn + " reçoit un appel de " + numeroAppelant);
    }

    public void afficherAppels() {
        System.out.println("Historique des appels pour " + msisdn + ": " + appelsRecus);
    }

    @Override
    public void emettreAppel(String destinataire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

// Exemple d'héritage 
class Smartphone extends OnanaMS {
    public Smartphone(String nom, String prenom, String mdp, String msisdn, String imsi) {
        super(nom, prenom, mdp, msisdn, imsi);
    }
    public void emettreAppel(String destinataire) {
        System.out.println(this.msisdn + " émet un appel vers le " + destinataire);
    }
    
    public void recevoirAppel(String emetteur) {
        // On garde votre logique actuelle
        System.out.println(this.msisdn + " reçoit un appel de " + emetteur);
    }
}


