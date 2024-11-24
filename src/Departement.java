import java.util.Comparator;
import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDepartemnt;
    private int nbrEmployees;

    public Departement() {
    }

    public Departement(int id, String nomDepartemnt, int nbrEmployees) {
        this.id = id;
        this.nomDepartemnt = nomDepartemnt;
        this.nbrEmployees = nbrEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartemnt() {
        return nomDepartemnt;
    }

    public void setNomDepartemnt(String nomDepartemnt) {
        this.nomDepartemnt = nomDepartemnt;
    }

    public int getNbrEmployees() {
        return nbrEmployees;
    }

    public void setNbrEmployees(int nbrEmployees) {
        this.nbrEmployees = nbrEmployees;
    }
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartemnt='" + nomDepartemnt + '\'' +
                ", nbrEmployees=" + nbrEmployees +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDepartemnt, that.nomDepartemnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartemnt);
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id);
    }
}
