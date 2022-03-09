/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole1al2;

import java.util.Comparator;

/**
 *
 * @author wiemhjiri
 */
public class CritereNom implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant arg0, Etudiant arg1) {
        return arg0.getNom().compareTo(arg1.getNom());
    }
    
}
