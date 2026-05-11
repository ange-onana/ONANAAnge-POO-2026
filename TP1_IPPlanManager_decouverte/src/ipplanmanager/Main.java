/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipplanmanager;

/**
 *
 * @author USER
 */
public class Main {
  public static void main(String[] args) { 
        System.out.println("===== IPPlan-Manager : TP1 =====");     
        System.out.println("Découverte des premières classes du projet"); 
        System.out.println(); 
        adressesIP ipRouteur = new adressesIP("192.168.1.1"); 
        adressesIP ipServeur = new adressesIP("192.168.1.10"); 
        adressesIP ipClient = new adressesIP("192.168.1.50"); 
        adressesIP ipClient2= new adressesIP("192.168.1.51"); 
        adressesIP ipSwitch = new adressesIP("192.168.1.20"); 
         InterfaceReseau interfaceRouteur = new InterfaceReseau("eth0", ipRouteur); 
        InterfaceReseau interfaceServeur = new InterfaceReseau("eth0", ipServeur); 
        InterfaceReseau interfaceClient = new InterfaceReseau("wlan0", ipClient); 
        InterfaceReseau interfaceClient2 = new InterfaceReseau("wlan0", ipClient2); 
        InterfaceReseau interfaceSwitch = new InterfaceReseau("eth0", ipSwitch);
        InterfaceReseau interfaceSansIP = new InterfaceReseau("eth0", null);
 
        interfaceRouteur.activer();        
        interfaceServeur.activer(); 
        interfaceSwitch.activer(); 
        interfaceSansIP.activer(); 
 
        Equipement routeur = new Equipement("R1_EDGE", "Routeur", interfaceRouteur); 
        Equipement serveur = new Equipement("SRV_DNS", "Serveur", interfaceServeur); 
        Equipement client = new Equipement("PC_ADMIN", "Poste client", interfaceClient); 
        Equipement client2 = new Equipement("PC_comptable", "Poste client2", interfaceClient2); 
        Equipement Switch = new Equipement("sw_1", "Switch", interfaceSwitch); 
 
        reseauIP reseauPrincipal = new reseauIP( 
                "192.168.1.0", 
                24, 
                "Réseau principal du laboratoire IRT" 
        ); 
        reseauIP reseausecondaire = new reseauIP( 
        "192.168.2.0",
        24,
        "Réseau secondaire du laboratoire IRT"
        );
 
        System.out.println("----- Réseaux créé -----");        
        reseauPrincipal.afficher(); 
        reseausecondaire.afficher();
 
        System.out.println(); 
        System.out.println("----- Équipements créés -----"); 
 
        System.out.println();         routeur.afficher(); 
 
        System.out.println();         serveur.afficher(); 
 
        System.out.println();         client.afficher(); 
        System.out.println();         client2.afficher(); 
        System.out.println();         Switch.afficher(); 
    } 

  
}
