/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author wiemhjiri
 */
public class TestSet {

    public static void main(String[] args) {

//        Set<String> set = new TreeSet<>();
//
//        set.add("test");
//        set.add("atest");
//        set.add("test2");
//        set.add("test2");
//        
//       // System.out.println(set);
//       for(String s:set)
//           System.out.println(s);
        Enseignant e1 = new Enseignant(1, "test1", "test");
        Enseignant e2 = new Enseignant(2, "test", "atest");
        Enseignant e3 = new Enseignant(5, "atest1", "wtest");
        Enseignant e4 = new Enseignant(2, "test2", "test2");
       // Enseignant e5 = new Enseignant(1, "abc", "test2");


       //EspritHashSet esprit = new EspritHashSet();
      EspritTreeSet esprit=new EspritTreeSet();
        esprit.ajouterEnseignant(e1);
               // esprit.ajouterEnseignant(e1);

        esprit.ajouterEnseignant(e2);
        esprit.ajouterEnseignant(e3);
        esprit.ajouterEnseignant(e4);
       //esprit.ajouterEnseignant(e5);

        
        esprit.displayEnseignants();

    }

}
