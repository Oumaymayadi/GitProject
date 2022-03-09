/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author wiemhjiri
 */
public class TestMap {

    public static void main(String[] args) {
//        Map<String, Integer> map=new HashMap<>();
//        
//        map.put("test", 1);
//               // map.putIfAbsent("test", 2);
//
//        map.putIfAbsent("test3", 1);
//        System.out.println(map);
////V get(K)
//        //methodes utiles
//        //  Set<K> keySet();
//        // Collection<V> values()
//        // Set<Entry<K,V>> entryset()
//        // containskey()
//        //containsValue()
//        //remove(k)
//        //remove(k,v)
//        Set<String> set=map.keySet();
//        System.out.println("keys"+set);
//        
//        System.out.println("Values "+map.values());
//        
//        System.out.println("recherche key"+map.containsKey("test"));
//        System.out.println("recherche value"+map.containsValue(3));
//        
//        System.out.println("Set<entry<K,V>> : "+map.entrySet());

        Employe e1 = new Employe(1, 1, "samar", "samar");
        Employe e2 = new Employe(2, 1, "wafa", "wafa");
        Employe e3 = new Employe(3, 1, "draouil", "draouil");
        Employe e4 = new Employe(3, 2, "draouil1", "test");

        Departement d1 = new Departement(1, "info");
        Departement d2 = new Departement(2, "telecom");

       // SocieteHashMap societe = new SocieteHashMap();
       SocieteTreeMap societe=new SocieteTreeMap();

        societe.ajouterEmployeDepartement(e1, d1);
        societe.ajouterEmployeDepartement(e4, d2);

        societe.ajouterEmployeDepartement(e2, d1);
        societe.ajouterEmployeDepartement(e3, d1);

        societe.afficherLesEmployesLeursDepartements();
        
        

    }

}
