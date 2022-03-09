/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author wiemhjiri
 */
public class EspritTreeSet implements GestionEnseignant{
    
    private Set<Enseignant> ens;

    public EspritTreeSet() {
        ens=new TreeSet<>(new Comparator<Enseignant>() {
            @Override
            public int compare(Enseignant arg0, Enseignant arg1) {
                return arg0.getNom().compareTo(arg1.getNom());
            }
        })
                ;
    }
    
      @Override
    public void ajouterEnseignant(Enseignant e) {
        ens.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return ens.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
            for(Enseignant e:ens){
                if(e.getId()==id)
                    return true;
            }
            return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
            ens.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e:ens){
            System.out.println(e);
        }
            
    }
    
    
}
