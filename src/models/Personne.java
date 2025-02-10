package models;

import javax.swing.GrayFilter;

public class Personne {

        private final String nom;
        private final String prenom;
        private static final int MAX_COPAINS = 10;
        private final Personne[] copains;
        private int nombreCopains;

        public Personne(String prenom, String nom) {
                this.nom = nom;
                this.prenom = prenom;
                this.copains = new Personne[MAX_COPAINS];
                this.nombreCopains = 0;
        }

        public String getNom() {
                return nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public String toString(Personne copain) {
                if (nombreCopains == 0) {
                        return prenom + " " + nom.toUpperCase() + " et ses copains ()";
                }
                else {
                        for (j = 0; j < copains.length; j++) {
                       
                                return prenom + " " + nom.toUpperCase() + " et ses copains " + " (" + copains[j] + " )";
                        
                
               }
        }
              
        }

        public boolean ajouterCopain(Personne copain) {
                if (nombreCopains < MAX_COPAINS) {
                        copains[nombreCopains++] = copain;
                        return true;
                }
                return false; // si c'est plein
        }

        public boolean supprimerCopain(Personne copain) {
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i].equals(copains)) {
                                copains[i] = copains[nombreCopains - 1]; // remplace le copain supprimé
                                copains[nombreCopains - 1] = null; // supprime la référence
                                nombreCopains--;
                                return true;

                        }
                }
                return false;
        }
}
