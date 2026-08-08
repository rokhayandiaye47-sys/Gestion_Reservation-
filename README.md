# System de Gestion Événementielle & Réservations (Java POO)

> Application de gestion des réservations (salles et chambres) développée en Java console,
>  illustrant les concepts fondamentaux de la POO (Interface, Polymorphisme, Encapsulation et Collections).

---

  Concepts Clés Implémentés

* **Polymorphisme & Abstraction :** Utilisation de l'interface `IReservation` pour uniformiser les opérations de calcul de prix et d'affichage.
* **Architecture Propre (Packages) :**
  * `impl` : Interfaces et contrats de service.
  * `models` : Entités métier (`ReservationChambre`, `ReservationSalle`).
  * `services` : Logique de gestion et centralisation (`GestionEvenementiel`).
* **Collections Java :** Utilisation de `ArrayList<IReservation>` pour stocker dynamiquement plusieurs types de réservations.
* **Interface Console :** Menu interactif géré par `Scanner` et structure `do-while / switch`.

---

 Fonctionnalités

1. **Réservation de Chambres :**
   * Calcul du montant total basé sur le prix de la nuit, le nombre de nuits et le tarif du petit-déjeuner.
2. **Réservation de Salles :**
   * Calcul du montant total basé sur le prix horaire, le nombre d'heures et l'application automatique d'une taxe fixe (15 000).
3. **Rapport Journalier & Chiffre d'Affaires :**
   * Parcours polymorphique de l'ensemble des réservations pour afficher le récapitulatif détaillé et calculer le chiffre d'affaires global.

---

 Structure du Projet

```text
src/
├── impl/
│   └── IRESERVATION.java         # Interface définissant le contrat de réservation
├── models/
│   ├── ReservationChambre.java   # Modèle pour la réservation de chambre
│   └── ReservationSalle.java     # Modèle pour la réservation de salle
├── services/
│   └── GestionEvenementiel.java  # Service de gestion de la liste et calcul du CA
└── Main.java                     # Point d'entrée avec menu interactif
