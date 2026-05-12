\## **TP5 : Implémentation du moteur VLSM**



\### **1. Objectif**



Le but principal de ce projet est de développer un moteur VLSM  capable de proposer automatiquement un plan d'adressage optimisé en fonction des besoins spécifiques en nombre d'hôtes.



\### 2. Notions Étudiées



Algorithme VLSM\*\* : Découpage efficace pour éviter le gaspillage d'adresses IP.

Gestion des Collections : Utilisation d' `ArrayList` et de `Comparator` pour trier les besoins.

Classe de Service Métier : Création d'une classe dédiée (`MoteurVLSM`) pour la logique de calcul.

Conversion IP vers Entier : Manipulation mathématique des adresses IP pour faciliter les calculs.



\### 3. Scénarios de Test



Scénario 1 : Réseau par défaut (192.168.1.0)

Besoins : TECHNIQUE (120), WIFI (80), ADMIN (50), SERVEURS (20), DIRECTION (10).





Scénario 2 : Petite Entreprise (192.168.2.0) Besoins : ADMIN (25), COMPTABILITE (12), WIFI\_INVITES (40), SERVEURS (8).





Scénario 3 : Campus (10.0.0.0)

Besoins : ETUDIANTS (500), PERSONNEL (120), LABO (60), ADMIN (40), WIFI\_PUBLIC (200).







\### 4. Améliorations Techniques 



La classe `CalculateurReseau` a été enrichie pour calculer les plages d'IP utilisables :



\* \*\*Première adresse utilisable\*\* : Adresse Réseau + 1.

\* \*\*Dernière adresse utilisable\*\* : Adresse de Diffusion - 1.



\### 5. Questions de Compréhension 

1\. Pourquoi le VLSM économise-t-il des adresses IP ?

Il permet de créer des sous-réseaux de tailles différentes, adaptant le préfixe exactement aux besoins au lieu d'utiliser des blocs de taille fixe.



2\. Pourquoi faut-il traiter les plus grands besoins en premier ?

Pour éviter la fragmentation de l'espace d'adressage et garantir que les grands blocs tiennent dans la plage disponible.



3\. Différence entre un besoin et un résultat VLSM ?

Un besoin est ce que l'utilisateur demande (hôtes) ; un \*résultat\* est ce que le système propose (IP, Masque, Plage).



4\. Pourquoi `MoteurVLSM` est-elle une classe de service métier ?\*\*

Parce qu'elle ne stocke pas seulement des données, elle applique une logique et des calculs pour transformer les entrées en résultats.



5\. Pourquoi convertir une IP en entier ?

Pour effectuer facilement des opérations mathématiques, comme ajouter la taille d'un bloc pour trouver le réseau suivant.



6\. Rôle de `calculerCidrPourHotes()` ?

Elle trouve le plus petit préfixe CIDR capable d'accueillir le nombre d'hôtes demandé.



7\. Pourquoi l'adresse réseau et l'adresse de diffusion ne sont pas attribuables ?

L'adresse réseau identifie le sous-réseau lui-même, et l'adresse de diffusion sert à envoyer des données à tous les hôtes simultanément.





