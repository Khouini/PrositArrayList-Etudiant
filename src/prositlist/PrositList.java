/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositlist;

/**
 *
 * @author Trunks
 */
public class PrositList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Etudiant E1 = new Etudiant(3,"Bacine", "Khouini");
        Etudiant E2 = new Etudiant(1,"Zacine", "Khouini");
        Etudiant E3 = new Etudiant(2,"Yacine", "Khouini");
        
        EspritArrayList Esprit = new EspritArrayList();
        Esprit.ajouterEtudiant(E1);
        Esprit.ajouterEtudiant(E2);
        Esprit.ajouterEtudiant(E3);
        System.out.println("Before\n");
        Esprit.displayEtudiants();
        System.out.println("\nTri par Id\n");
        Esprit.trierEtudiantsParId();
        Esprit.displayEtudiants();
        System.out.println("\nTri par nom\n");
        Esprit.trierEtudiantsParNom();
        Esprit.displayEtudiants();
        
    }
    
}
