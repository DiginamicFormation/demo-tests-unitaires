package fr.diginamic.enumerations;

public class SaisonTestLesOrigineDuMal {
    public static void main(String[] args) {
        //System.out.println(Saison.valueOfLibelle("Printemps"));

        // Les minuscules et majuscule ont fait échouer le teste
        //System.out.println(Saison.valueOfLibelle("PRINTEMPS"));
        //System.out.println(Saison.valueOfLibelle("printemps"));

        // Les espaces fesais bug
        System.out.println(Saison.valueOfLibelle("Printemps "));

        // Pour résoudre le bug des accents, j'ai modifié le libélé Eté en Été. Je pourrais remplacer les E part des É ou vis versa
        // mais, ma méthode est beaucoup mieux au vu de l'équilibre temps, énnergie, performance
        System.out.println(Saison.valueOfLibelle("été"));
    }
}
