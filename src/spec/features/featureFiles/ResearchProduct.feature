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
    When Je saisis le nom du produit "Apple MacBook Pro 13-inch"
    And Je saisis la categorie
    And Je clique sur le bouton search
    Then Je verifie le produit "Apple MacBook Pro 13-inch"

  @ajoutProduct
  Scenario: Ajout
    And Je clique sur le bouton add new