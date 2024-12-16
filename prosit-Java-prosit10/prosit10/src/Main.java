//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Ressources Humaines", 5);
        Departement d3 = new Departement(3, "Comptabilité", 7);

        // Ajout des départements
        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        // Affichage des départements
        gestion.displayDepartement();

        // Recherche par nom
        System.out.println("Recherche 'Informatique': " + gestion.rechercherDepartement("Informatique"));

        // Recherche par objet
        System.out.println("Recherche d1: " + gestion.rechercherDepartement(d1));

        // Suppression
        gestion.supprimerDepartement(d2);

        // Affichage trié par ID
        System.out.println("Départements triés par ID: ");
        for (Departement d : gestion.trierDepartementById()) {
            System.out.println(d);
        }

    }
}