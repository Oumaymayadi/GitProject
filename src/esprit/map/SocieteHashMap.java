/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wiemhjiri
 */
public class SocieteHashMap implements Societe{
    
    private Map<Employe,Departement> societe_map;

    public SocieteHashMap() {
        societe_map=new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
       // societe_map.put(e, d);
        societe_map.putIfAbsent(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societe_map.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        //System.out.println(societe_map);
//        for(Employe e:societe_map.keySet())
//        {
//            System.out.println(e+" "+societe_map.get(e));
//        }
        for(Map.Entry<Employe,Departement> en:societe_map.entrySet())
        {
            System.out.println(en.getKey()+"***"+en.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
       // System.out.println(societe_map.keySet());
       for(Employe e:societe_map.keySet())
       {
           System.out.println(e);
       }
    }

    @Override
    public void afficherLesDepartements() {
       // System.out.println(societe_map.values());
        for(Departement d:societe_map.values())
        {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(societe_map.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societe_map.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return societe_map.containsValue(e);
    }
    
}
