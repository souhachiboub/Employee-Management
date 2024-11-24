import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SocieteArrayList  implements IGestion<Employee> {
    List<Employee>employees=new ArrayList<>();
    @Override
    public void ajouterEmploye(Employee employee) {

        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee emp : employees) {
            if (emp.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employees,new Employee());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
