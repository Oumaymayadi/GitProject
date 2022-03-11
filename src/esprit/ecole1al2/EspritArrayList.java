/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole1al2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 *
 *// modfication ahlem_jebali
 
 
 //my new modification 
 */
public class EspritArrayList implements University{
    
    private List<Etudiant> etudiants;

    public EspritArrayList() {
        etudiants=new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
//         for(int i=0;i<etudiants.size();i++)
//             if(etudiants.get(i).getNom().equals(nom))
//                 return true;
//         return false;
           for(Etudiant e:etudiants)
               if(e.getNom().equals(nom))
                   return true;
           return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
            etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
          // System.out.println(etudiants);
          for(Etudiant e:etudiants)
             System.out.println(e);

//Iterator<Etudiant> it=etudiants.iterator();
//while(it.hasNext()){
//    System.out.println(it.next());
//}
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, new CritereNom());
    }
    
     public void trierEtudiantsParPrenom() {
//        Collections.sort(etudiants, new Comparator<Etudiant>() {
//            @Override
//            public int compare(Etudiant arg0, Etudiant arg1) {
//                return arg0.getPrenom().compareTo(arg1.getPrenom());
//            }
//        });

        etudiants.sort(new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant arg0, Etudiant arg1) {
                return arg0.getPrenom().compareTo(arg1.getPrenom());
            }
        });

//Comparator.comparing((Etudiant arg0) ->{ return arg0.getNom();});
        
    }
    
    
    
    
}
