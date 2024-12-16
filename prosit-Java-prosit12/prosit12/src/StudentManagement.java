import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Student> etudiants, Consumer<Student> con) {
        for (Student student : etudiants) {
            con.accept(student);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        for (Student student : students) {
            if (pre.test(student)) {
                con.accept(student);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Student> Etudiants, Function<Student, String> fun) {
        return Etudiants.stream()
                .map(fun)
                .collect(Collectors.joining(", "));

            }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> Etudiants, Comparator<Student> com) {
        return Etudiants.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }

    @Override
    public Stream <Student> convertToStream(List<Student> students) {
        return students.stream();
    }


}
