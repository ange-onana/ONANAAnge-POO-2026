/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsm.model;

/**
 *
 * @author USER
 */
public class OnanaTestReseau {
    public static void main(String[] args) {
        try {
          
            OnanaReseau monOrange = new OnanaReseau("Orange Radio", 900.0, 1800.0); 
            System.out.println("--- Démarrage du test Réseau ---");

         
            OnanaBTS btsUrbaine = new OnanaBTS(101, "Centre-Ville", "Urbaine", 2); 
            OnanaBTS btsRurale = new OnanaBTS(202, "Village-Nord", "Rural", 10); 
            
            monOrange.ajouterBTS(btsUrbaine); 
            monOrange.ajouterBTS(btsRurale);

            OnanaMS user1 = new OnanaMS("Kotto", "Ali", "pass1", "677112233", "IMSI-001"); 
            OnanaMS user2 = new OnanaMS("Moussa", "Jean", "pass2", "655445566", "IMSI-002");
            OnanaMS user3 = new OnanaMS("Zambo", "Paul", "pass3", "699001122", "IMSI-003");
            
            try {
            btsUrbaine.ajouterMS(user1);
            btsUrbaine.ajouterMS(user2);
            
            btsUrbaine.ajouterMS(user3); 
            
        } catch (Exception e) {
           
            System.err.println("ALERTE RÉSEAU : " + e.getMessage());
        }

            System.out.println("\nTentative d'attachement à la BTS Urbaine (Max: 2)...");
            btsUrbaine.ajouterMS(user1); 
            btsUrbaine.ajouterMS(user2);
            

            // 5. Test de recherche et localisation
            System.out.println("\n--- Vérification des données ---");
            System.out.println("Nombre total d'abonnés inscrits : " + monOrange.calculerTotalAbonnes()); 
            monOrange.rechercherLocalisation("655445566"); 

            // 6. Test de communication (Simulation d'appel)
            System.out.println("\n--- Simulation Appel ---");
            user2.recevoirAppel(user1.msisdn); 
            user2.afficherAppels(); 

        } catch (Exception e) {
            System.out.println("Erreur durant l'exécution : " + e.getMessage());
        }
    }
}
    

