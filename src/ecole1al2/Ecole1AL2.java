/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole1al2;

/**
 *
 * @author wiemhjiri
 */
public class Ecole1AL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Etudiant e1 = new Etudiant(11, "etud1", "etud1");
        Etudiant e2 = new Etudiant(1, "etud5", "etud1");
        Etudiant e3 = new Etudiant(21, "etud", "etud1");
        Etudiant e4 = new Etudiant(2, "etud7", "etud1");
        Etudiant e5 = new Etudiant(3, "etud9", "etud1");

        EspritArrayList esprit = new EspritArrayList();

        esprit.ajouterEtudiant(e1);
        esprit.ajouterEtudiant(e2);
        esprit.ajouterEtudiant(e3);
        esprit.ajouterEtudiant(e4);
        esprit.ajouterEtudiant(e5);
        
        
       // esprit.trierEtudiantsParId();
       esprit.trierEtudiantsParNom();
        
        esprit.displayEtudiants();

    }

}
