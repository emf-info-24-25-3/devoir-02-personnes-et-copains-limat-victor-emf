package models;

import javax.swing.GrayFilter;

public class Personne {

        private final String nom;
        private final String prenom;
        private static final int MAX_COPAINS = 10;
        private final Personne[] copains;

        public Personne(String prenom, String nom) {
                this.nom = nom;
                this.prenom = prenom;
                this.copains = new Personne[MAX_COPAINS];
        }

        public String getNom() {
                return nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public String toString(Personne copain) {
                if (copains[0] == null) {
                        return prenom + " " + nom.toUpperCase() + " et ses copains ()";
                }
                
                else {
                        for (j = 0; j < copains.length; j++) {
                       
                                return prenom + " " + nom.toUpperCase() + " et ses copains " + " (" + copains[j] + " )";
                        
                
               }
        }
              
        }

        public void ajouterCopain(Personne copain) {
                boolean estPresent = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain) {
                                estPresent = true;
                        }
                }
        }

        public boolean supprimerCopain(Personne copain) {
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i].equals(copains)) {
                                copains[i] = null; // remplace le copain supprimé
                                break;

                        }
                }
                return false;
        }
}
