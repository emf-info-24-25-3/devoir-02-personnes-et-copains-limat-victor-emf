package app;

import models.Personne;

public class Application {
     public static void main(String[] args) {
        Personne personne1 = new Personne("Victor", "Limat");
        Personne personne2 = new Personne("Nohlan", "Vanden Broeck");
        Personne personne3 = new Personne("Hugo", "Maillard");
   
        System.out.println(personne1);
        System.out.println(personne2);
        System.out.println(personne3);
     }
      
}
