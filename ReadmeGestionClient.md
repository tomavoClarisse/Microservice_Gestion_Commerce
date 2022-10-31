##### Readme 

## Micro service Gestion des clients

Il s'agit d'un micro service qui implémente les fonctionnalités CRUD sur la table « Clients ». Il permet
d’afficher la liste de tous les clients. 
Il permet de Créer, modifier, supprimer un client, afficher de tous les clients ;
Une application front pourra aisément l'utiliser.

## Les essentiels pour l'installation

Le framework utilisé est SpringBoot
Le sgbd utilisé est MySQL
Vous n'avez pas besoin de créer une base de données.
Aller le fichier application.properties pour remplacer votre username et votre password de votre sgbd Mysql respectivement par MyUsername et MyPassword.
A l'exécution, ou à la compilation si toute les configurations sont ok, une base de données db_client sera crée et contiendra une table Clients
Afin de pouvoir exécuter et voir si les  fonctionnalité marche bien, vous pouvez installer  Postman est un logiciel qui va vous permettre d'appeler / tester une API. Nous allons regarder les bases de Postman.

## Dépendance utilisé


## Les mapping pour vous permettre de faire des actions

## Tester l'api sur Postman ou swagger ou meme avec une application front
### Liste des clients
http://localhost:8081/clients 
### Enregistrer un client
http://localhost:8081/client/create
### Modifier un objet client
http://localhost:8081/client/update
### Supprimer un client 
http://localhost:8081/client/delete{id}
### Liste des clients dont le statut d'activité est à 1
http://localhost:8081/clientsActifs
