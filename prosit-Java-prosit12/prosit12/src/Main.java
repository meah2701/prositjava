import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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
        ///////////////////////////////////prosit 12
        List< Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 21));

        StudentManagement management = new StudentManagement();
        System.out.println("All students:");
        management.displayStudents(students, student -> System.out.println(student));

        // Affichage des étudiants avec un âge supérieur à 20
        System.out.println("\nStudents older than 20:");
        management.displayStudentsByFilter(students, student -> student.getAge() > 20, student -> System.out.println(student));

        // Retourner les noms de tous les étudiants
        System.out.println("\nStudent names:");
        String names = management.returnStudentsNames(students, Student::getNom);
        System.out.println(names);

        // Création d'un nouvel étudiant
        System.out.println("\nCreated student:");
        Student newStudent = management.createStudent(() -> new Student(4, "David", 23));
        System.out.println(newStudent);

        // Trier les étudiants par ID et les afficher
        System.out.println("\nSorted students by ID:");
        List<Student> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        sortedStudents.forEach(System.out::println);

        // Conversion de la liste en flux et affichage
        System.out.println("\nStream of students:");
        Stream<Student> studentStream = management.convertToStream(students);
        studentStream.forEach(System.out::println);

    }
}