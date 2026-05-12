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
public interface AppareilConnecte {
  
    void emettreAppel(String destinataire);
    void recevoirAppel(String emetteur);
    
}
