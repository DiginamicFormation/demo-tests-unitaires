package fr.diginamic.utils;

import fr.diginamic.enumerations.Saison;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void levenshteinDistance() {
        // Test d'utilisation normal
        assertEquals(2, StringUtils.levenshteinDistance("Chine","Chien"));

        // Test d'utilisation avec null
        assertEquals(2, StringUtils.levenshteinDistance("", "un"));
        assertEquals(0, StringUtils.levenshteinDistance("",""));

        // Test avec les accents et les majuscules
        assertEquals(1, StringUtils.levenshteinDistance("Été","Eté"));
        assertEquals(1, StringUtils.levenshteinDistance("Eté","eté"));

        // Test mathématique
        assertEquals(2, StringUtils.levenshteinDistance("5+4=9", "5+3=8"));

        // Conclusion en quoi devons nous la rendre plus robuste ???? Lui permettre d'ignirer les espaces dans les opérations mathmatique ?
    }
}