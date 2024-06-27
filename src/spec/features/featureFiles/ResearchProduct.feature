@product
Feature: Je souhaire rechercher et ajouter un produit

  Background: 
    Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login 
    And Je clique sur le bouton catalog
    And Je clique sur le bouton products

  @rechercheProduit
  Scenario: Recherche de Produit
    And Je saisis le nom du produit "Build your own computer"
    And Je saisis la categorie
    And Je clique sur le bouton search
    Then Je verifie le produit "Build your own computer"

  @ajoutProduct
  Scenario: Ajout
    And Je clique sur le bouton add new