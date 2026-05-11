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

        InfrastructureReseau infrastructure = new InfrastructureReseau("Infrastructure YFY");

        reseauIP reseauAdmin = new reseauIP("192.168.1.0", 24, "Réseau administration");
        reseauIP reseauTech = new reseauIP("192.168.2.0", 24, "Réseau technique");
      
        reseauIP reseauWifi = new reseauIP("192.168.3.0", 24, "Réseau WiFi");

        SousReseau admin = new SousReseau("ADMIN", reseauAdmin);
        SousReseau tech = new SousReseau("TECH", reseauTech);
        SousReseau wifi = new SousReseau("WIFI", reseauWifi);

        infrastructure.ajouterSousReseau(admin);
        infrastructure.ajouterSousReseau(tech);
        infrastructure.ajouterSousReseau(wifi);
        
        adressesIP ip1 = new adressesIP("192.168.1.1");
        adressesIP ip2 = new adressesIP("10.0.0.1");
        InterfaceReseau eth0 = new InterfaceReseau("eth0", ip1);
        InterfaceReseau eth1 = new InterfaceReseau("eth1", ip2);
        eth0.activer();
        eth1.activer();

        Equipement routeur = new Equipement("R1_EDGE", "Routeur");
        routeur.ajouterInterface(eth0);
        routeur.ajouterInterface(eth1);
        infrastructure.ajouterEquipement(routeur);

        Equipement switchPrincipal = new Equipement("SW_CORE", "Switch");
        switchPrincipal.ajouterInterface(new InterfaceReseau("Port1", new adressesIP("192.168.1.2")));
        switchPrincipal.ajouterInterface(new InterfaceReseau("Port2", new adressesIP("192.168.1.3")));
        infrastructure.ajouterEquipement(switchPrincipal);

        Equipement serveurWeb = new Equipement("SRV_WEB", "Serveur");
        serveurWeb.ajouterInterface(new InterfaceReseau("eth0", new adressesIP("192.168.1.10")));
        infrastructure.ajouterEquipement(serveurWeb);
        
        Equipement pcCompta = new Equipement("PC_COMPTA", "PC");
        pcCompta.ajouterInterface(new InterfaceReseau("LAN", new adressesIP("192.168.1.50")));
        infrastructure.ajouterEquipement(pcCompta);

        Equipement laptopTech = new Equipement("LAPTOP_MAINT", "Laptop");
        laptopTech.ajouterInterface(new InterfaceReseau("eth0", new adressesIP("192.168.2.100")));
        infrastructure.ajouterEquipement(laptopTech);

        Equipement printer = new Equipement("PRN_LASER", "Imprimante");
        printer.ajouterInterface(new InterfaceReseau("Net", new adressesIP("192.168.1.200")));
        infrastructure.ajouterEquipement(printer);

            Equipement smartphone = new Equipement("PHONE_GUEST", "Mobile");
        smartphone.ajouterInterface(new InterfaceReseau("wlan0", new adressesIP("192.168.3.20")));
        infrastructure.ajouterEquipement(smartphone);

        Equipement scanner = new Equipement("SCAN_PRO", "Scanner");
        scanner.ajouterInterface(new InterfaceReseau("LAN", new adressesIP("192.168.2.150")));
        infrastructure.ajouterEquipement(scanner);
        infrastructure.afficher();
        
        System.out.println("\n--- TEST DE RECHERCHE ---");
        infrastructure.rechercherEquipement("SRV_WEB");  
        infrastructure.rechercherEquipement("TELEPHONE"); 
    }
}

