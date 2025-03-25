package services;

import models.Personne;

public class ListePersonne_AvecTrous {
    public final static int NBRE_MAX_PERSONNES = 6;

    private Personne[] personnes;

    public ListePersonne_AvecTrous() {
        this.personnes = new Personne[NBRE_MAX_PERSONNES];
    }

    public int getNombre() {
        int nbre_personne = 0;

        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] != null) {
                nbre_personne++;
            }
        }
        return nbre_personne;
    }

    public void vider() {
        int comptage = personnes.length;
        for (int i = 0; i < personnes.length; i++) {
            personnes[i] = null;
            comptage--;
        }
        System.out.println("Nombre de personnes : " + comptage);
    }

    public boolean ajouter(Personne p) {
        boolean ajoutReussi = false;

        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == null) {
                personnes[i] = p;
                ajoutReussi = true;
                break;
            }
        }
        return ajoutReussi;
    }

    public boolean supprimer(Personne p) {
        boolean supprReussi = false;

        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] != null) {
                personnes[i] = null;
                supprReussi = true;
                break;
            }
        }
        return supprReussi;
    }
    
    public void afficher() {
        int comptage = 0;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] != null) {
                System.out.println(personnes[i]);
                comptage++;
            }
        }
        System.out.println("Nombre de personnes : " + comptage);
    }
}
