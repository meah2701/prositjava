import java.util.Objects;

public class Departement {
    private int id_depart;
    private String nom_departement;
    private int nb_employe;
    public Departement() {}
    public Departement(int id_depart, String nom_departement,int nb_employe) {
        this.id_depart = id_depart;
        this.nom_departement = nom_departement;
        this.nb_employe = nb_employe;
    }

    public int getId_depart() {
        return id_depart;
    }

    public void setId_depart(int id_depart) {
        this.id_depart = id_depart;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNb_employe() {
        return nb_employe;
    }

    public void setNb_employe(int nb_employe) {
        this.nb_employe = nb_employe;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id_depart=" + id_depart +
                ", nom_departement='" + nom_departement + '\'' +
                ", nb_employe=" + nb_employe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement d)) return false;
        return id_depart == d.id_depart && Objects.equals(nom_departement, d.nom_departement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_depart,nom_departement);
    }

}
