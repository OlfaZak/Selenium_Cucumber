@login
Feature: Je souhaite verifier la page de connexion 
  ETQ utlisateur je souhaite vérifier la page de connexion
  
  Background:
  Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login 


  @login-valide
  Scenario: Connexion avec des donnees valides 
    Then Je me redirige vers la page home "Dashbord"
    
   

    

    

  