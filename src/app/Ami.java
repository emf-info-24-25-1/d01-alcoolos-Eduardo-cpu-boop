package models;

public class Ami {
    
    private String nom;
    private int maxBiere;
    private boolean estBouree = false;

    public Ami(String nom, int maxBiere) {
        this.nom = nom;
        this.maxBiere = maxBiere;
        System.out.println("L'ami " + nom + " est créé.");
    }

    public String getNom() {
        return this.nom;
    }

    public void boitUneBiere(){
        System.out.println(this.nom + " boit une bière");
        this.maxBiere = this.maxBiere - 1;
        if (this.maxBiere == 0) {
            this.estBouree = true;
        }
    }

    public boolean getEstBouree() {
        return this.estBouree;
    }

    public void getBiere() {
        System.out.println(this.nom + " peut encore boire " + this.maxBiere + " bière.");
    }
}
