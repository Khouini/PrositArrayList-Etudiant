/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositlist;

import java.util.Comparator;

/**
 *
 * @author Trunks
 */
public class StudentsTriNom implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        // car la classe String a sa méthode compareTo() pour comparer les strings
        return e1.getNom().compareTo(e2.getNom());
    }

}
