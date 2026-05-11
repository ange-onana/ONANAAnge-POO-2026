**TP3 : Collections et composition** 



**OBJECTIF**



Introduction des collections et composition.



* **Notions étudiées** 





Composition :Comprendre comment un objet peut être composé d'autres objets (ex: une infrastructure contenant des équipements).





ArrayList : Utilisation de cette collection pour stocker et manipuler des listes d'objets de manière dynamique.





Parcours de listes :Utilisation de la boucle for-each pour parcourir les collections et afficher les données.





Relations entre objets : Création de liens logiques entre les réseaux, les sous-réseaux et les équipements.







* **Tests réalisés** 



Instanciation :Création d'une infrastructure nommée "Infrastructure YFY".





Gestion des réseaux : Ajout réussi de trois sous-réseaux : **Administration, Technique et WiFi**.





Manipulation d'équipements : Ajout de plus de 5 équipements variés **(Routeur, Switch, Serveur, PC, Smartphon**e).





Validation des interfaces : Vérification que chaque équipement peut posséder et afficher plusieurs interfaces réseau activées.





Recherche : Test de la méthode `rechercherEquipement` pour confirmer qu'un équipement peut être retrouvé par son nom ou qu'un message d'erreur s'affiche s'il est introuvable.







* **Difficultés rencontrées** 



-Gestion des accolades :Lors de l'imbrication des méthodes dans la classe `InfrastructureReseau`, des erreurs de compilation sont apparues à cause d'accolades mal fermées.



-Méthodes de recherche : L'implémentation de la recherche a nécessité de bien comprendre comment comparer des chaînes de caractères (Strings) à l'intérieur d'une boucle parcourant une `ArrayList`.



* **Réponses aux questions de compréhension** 



1\. Composition : C'est une relation où un objet "possède" d'autres objets. Si l'objet parent disparaît, les objets qui le composent n'ont plus de sens dans ce contexte.





2\. 

ArrayList : Elle est utilisée car elle permet d'ajouter ou de supprimer des objets sans avoir à définir une taille fixe à l'avance, contrairement à un tableau classique.





3\. 

Variable simple vs Collection : Une variable simple ne contient qu'une seule référence (un seul objet), tandis qu'une collection peut en stocker des centaines de manière organisée.





4\. 

Interfaces multiples :Un équipement réel (comme un routeur) doit pouvoir se connecter à plusieurs réseaux simultanément, ce qui nécessite plusieurs interfaces physiques ou logiques.





5\. 

Sous-réseaux :On segmente une infrastructure pour améliorer la sécurité, limiter le trafic de diffusion et faciliter l'administration par services.





6\. 

Boucle for-each : Elle sert à parcourir chaque élément d'une liste du premier au dernier sans avoir à gérer manuellement un index.





7\. 

InfrastructureReseau :Cette classe est cruciale car elle centralise tous les composants du réseau, permettant de manipuler l'ensemble du système via un seul objet "cœur".

8\. 

Collections professionnelles : Elles sont indispensables car une entreprise gère des volumes de données massifs (milliers d'équipements) qui seraient impossibles à coder avec des variables individuelles.

lien du depot: https://github.com/ange-onana/ONANAAnge-POO-2026.git