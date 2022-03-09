/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.set;

/**
 *
 * @author wiemhjiri
 */
public class Enseignant implements Comparable<Enseignant>{
    private int id;
    private String prenom;
    private String nom;

    public Enseignant() {
    }

    public Enseignant(int id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", prenom=" + prenom + ", nom=" + nom + '}';
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return id+3;//+nom.hashCode();
    }

   
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enseignant other = (Enseignant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Enseignant arg0) {
        return this.id-arg0.id;
    }
    
    
}
