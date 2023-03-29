package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {

    Maison maison = new Maison();
    Chambre chambre = new Chambre(1, 20);
    Chambre chambre2 = new Chambre(1, 20);
    Chambre chambre3 = new Chambre(2, -200);

    Cuisine cuisine = new Cuisine(1, 20);
    SalleDeBain salleDeBain = new SalleDeBain(1, 20);

    // Je ne voit pas de problème rendant imposible d'a avoir son salon dans la cave.
    // Certaine maison sont même entérer de nos jour 0.o
    // Il y as aussi des locations d'appartement au sous sol
    Salon salon = new Salon(-1, 20);
    WC wc = new WC(1, 20);

    @Test
    void ajouterPiece(){
        assertEquals("Pièce non ajouté", maison.ajouterPiece(chambre3));
        assertEquals("Pièce ajouté", maison.ajouterPiece(salon));
    }

    @Test
    void nbPieces() {
        // Retrait d'un -1 pour avoir le bon nombre de piece
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(salon);
        assertEquals(6, maison.nbPieces());
    }

    @Test
    void superficieEtage() {
        // Modification, il ne prenais que la superficie de la dernière pièce testé
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(chambre3);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(salon);
        assertEquals(100, maison.superficieEtage(1));
    }

    @Test
    void superficieTypePiece() {
        // Superficie commencais avec i=1
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(chambre3);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(salon);
        assertEquals(40, maison.superficieTypePiece("Chambre"));
    }

    @Test
    void calculerSurface() {
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wc);
        maison.ajouterPiece(salon);
        assertEquals(120, maison.calculerSurface());
    }
}