/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositlist;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

/**
 *
 * @author Trunks
 */
public class EspritArrayList implements University {

    ArrayList<Etudiant> StudentsArray = new ArrayList<Etudiant>(); // Create an ArrayList object

    @Override
    public void ajouterEtudiant(Etudiant e) {
        StudentsArray.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < StudentsArray.size(); i++) {
            if (StudentsArray.get(i).equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i = 0; i < StudentsArray.size(); i++) {
            if (StudentsArray.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        boolean test = rechercherEtudiant(e);
        if (test) {
            StudentsArray.remove(e);
        }
    }

    @Override
    public void displayEtudiants() {
        System.out.println(StudentsArray.toString());
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(StudentsArray);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(StudentsArray, new StudentsTriNom());
    }

}
