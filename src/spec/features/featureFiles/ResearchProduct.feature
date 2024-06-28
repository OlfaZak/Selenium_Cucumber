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
    And Je selectionne la categorie
    And Je clique sur le bouton search


  @ajoutProduit
  Scenario: Ajout d'un produit
    When Je clique sur le bouton Add new
    And Je saisie le nom du produit "MacOl"
    And je selectionne un tax categorie
    And Je clique sur le bouton Save
    Then Je verifie le produit "MacOl"
    
    