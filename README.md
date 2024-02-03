# Gestionnaire d'Entités avec Java, Gradle et HSQLDB

Ce projet propose une implémentation simple d'un gestionnaire d'entités en Java, utilisant la réflexion et le framework Gradle. Il intègre également une base de données HSQLDB en mémoire pour la persistance des entités.

## Configuration

Assure-toi d'avoir Gradle installé sur ta machine.

### Base de données HSQLDB

Le gestionnaire d'entités utilise une base de données HSQLDB en mémoire. Aucune configuration supplémentaire n'est requise.

## Utilisation

1. Clône le projet sur ta machine locale.
2. Ouvre le projet dans ton environnement de développement préféré.
3. Exécute les tâches Gradle nécessaires.

## Tâches Gradle Disponibles

- `build` : Compile le projet.
- `test` : Exécute les tests unitaires.
- `run` : Exécute l'application principale.

## Fonctionnalités

- Recherche d'entité par clé primaire.
- Fusion d'entité pour mettre à jour les modifications dans la base de données.
- Persistance d'entité dans la base de données.

## Exemple d'utilisation

Voici un exemple d'utilisation du gestionnaire d'entités dans un contexte d'application Java :

```java
// Initialisation du gestionnaire d'entités
EntityManagerImpl entityManager = new EntityManagerImpl();

// Persistance d'une nouvelle entité
Club newClub = new Club();
newClub.setFabricant("Fabricant1");
entityManager.persist(newClub);

// Recherche d'une entité par clé primaire
Club club = entityManager.find(Club.class, 1);

// Modification d'une entité
club.setFabricant("Fabricant2");

// Fusion de l'entité pour mettre à jour la base de données
Club mergedClub = entityManager.merge(club);

// Fermeture de la connexion à la base de données
entityManager.closeConnection();
```