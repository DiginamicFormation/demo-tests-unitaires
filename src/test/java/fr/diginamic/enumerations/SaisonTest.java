package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    void testValueOfLibelle() {
        Saison saison = Saison.valueOfLibelle("Printemps");

        assertEquals(Saison.PRINTEMPS, saison);

        Saison saison2 = Saison.valueOfLibelle("PRINTEMPS");

        assertEquals(Saison.PRINTEMPS, saison2);

        Saison saison3 = Saison.valueOfLibelle("Hiver");

        assertEquals(Saison.HIVER, saison3);

        Saison saison4 = Saison.valueOfLibelle("Été");

        assertEquals(Saison.ETE, saison4);
    }
}