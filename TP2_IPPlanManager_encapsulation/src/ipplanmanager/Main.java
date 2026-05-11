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
        System.out.println("===== TP2 : Encapsulation ====="); 
        adressesIP ip1 = new adressesIP("192.168.1.1"); 
        //adressesIP ip2 = new adressesIP(""); 
        //adressesIP ip3 = new adressesIP(null); 
        adressesIP ip4 = new adressesIP("192.168.1.4"); 
        adressesIP ip5 = new adressesIP("192.168.1.5"); 
        //adressesIP ip6 = new adressesIP(""); 
        InterfaceReseau interface1 = new InterfaceReseau("eth0", ip1); 
        //InterfaceReseau interface2 = new InterfaceReseau("", ip2); 
        InterfaceReseau interface4 = new InterfaceReseau("eth0", ip4); 
        InterfaceReseau interface5 = new InterfaceReseau("eth1", ip5); 
 
        interface1.activer(); 
        interface4.activer(); 
        interface5.activer(); 
        Equipement routeur = new Equipement( 
                        "R1_EDGE",                  
                         "Routeur",                        
                          interface1 
                ); 
        Equipement Switch = new Equipement( 
                        "sw_1",                  
                         "Switch",                        
                          interface4
                ); 
        Equipement pc_client1 = new Equipement( 
                        "pc_1",                  
                         "client",                        
                          interface5 
                ); 
       // Equipement serveur =                 
                       // new Equipement( 
                        //"", 
                       // "",                         interface2 
              //  ); 
 
        reseauIP reseau1 =                 new reseauIP( 
                        "192.168.1.0", 
                        24, 
                        "Réseau principal" 
                ); 
 
        reseauIP reseau2 =                 new reseauIP(                         "", 
                        55, 
                        "" 
                ); 
 
        System.out.println(); 
        System.out.println("----- Réseau 1 -----");         reseau1.afficher(); 
 
        System.out.println(); 
        System.out.println("----- Réseau 2 -----");         reseau2.afficher(); 
 
        System.out.println(); 
        System.out.println("----- Équipement 1 -----");         routeur.afficher(); 
 
        //System.out.println(); 
       // System.out.println("----- Équipement 2 -----");         serveur.afficher(); 
        
        System.out.println(); 
        System.out.println("----- Équipement 4 -----");         Switch.afficher(); 
        
        System.out.println(); 
        System.out.println("----- Équipement 5 -----");       pc_client1.afficher(); 
    } 
        
   
}
