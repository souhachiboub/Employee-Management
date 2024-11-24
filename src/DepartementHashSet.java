import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departements=new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {

        for (Departement d : departements) {
            if (d.getNomDepartemnt().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {

        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);

    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> iterator = departements.iterator();
        while (iterator.hasNext()) {
            Departement departement = iterator.next();
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);
    }



}
