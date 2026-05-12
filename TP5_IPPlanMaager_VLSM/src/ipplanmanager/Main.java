/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipplanmanager;
import java.util.ArrayList; 
 

/**
 *
 * @author USER
 */
public class Main {
      public static void main(String[] args) { 
    System.out.println("===== IPPlan-Manager : TP5 - Moteur VLSM ====="); 
    ArrayList<BesoinReseau> besoins = new ArrayList<>();        
    besoins.add(new BesoinReseau("TECHNIQUE", 120));        
    besoins.add(new BesoinReseau("WIFI", 80));          
    besoins.add(new BesoinReseau("ADMINISTRATION", 50));       
    besoins.add(new BesoinReseau("SERVEURS", 20));         
    besoins.add(new BesoinReseau("DIRECTION", 10)); 

    System.out.println(); 
    System.out.println("Besoins exprimés par l'utilisateur (Scénario 1) :"); 
    for (BesoinReseau besoin : besoins) {              
        besoin.afficher(); 
    } 

    MoteurVLSM moteur = new MoteurVLSM();          
    ArrayList<ResutatVLSM> resultats = moteur.genererPlan("192.168.1.0", besoins); 

    System.out.println(); 
    System.out.println("Plan d'adressage proposé (Scénario 1) :");     
    for (ResutatVLSM resultat : resultats) {              
        resultat.afficher(); 
    } 

    System.out.println("\n===== SCÉNARIO 2 : PETITE ENTREPRISE =====");
    ArrayList<BesoinReseau> besoinsPME = new ArrayList<>();
    besoinsPME.add(new BesoinReseau("ADMIN", 25));
    besoinsPME.add(new BesoinReseau("COMPTABILITE", 12));
    besoinsPME.add(new BesoinReseau("WIFI_INVITES", 40));
    besoinsPME.add(new BesoinReseau("SERVEURS", 8));

    ArrayList<ResutatVLSM> resultatsPME = moteur.genererPlan("192.168.2.0", besoinsPME);
    for (ResutatVLSM res : resultatsPME) {
        res.afficher();
    }
    
    System.out.println("\n===== SCÉNARIO 3 : CAMPUS =====");
    ArrayList<BesoinReseau> besoinsCampus = new ArrayList<>();
    besoinsCampus.add(new BesoinReseau("ETUDIANTS", 500));
    besoinsCampus.add(new BesoinReseau("PERSONNEL", 120));
    besoinsCampus.add(new BesoinReseau("LABO", 60));
    besoinsCampus.add(new BesoinReseau("ADMIN", 40));
    besoinsCampus.add(new BesoinReseau("WIFI", 200));

    ArrayList<ResutatVLSM> resultatsCampus = moteur.genererPlan("10.0.0.0", besoinsCampus);
    for (ResutatVLSM res : resultatsCampus) {
        res.afficher();
        
    } 
  
    
}
      }
