import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList employees=new SocieteArrayList();
        Employee employee1=new Employee(1, "Alice","Jenyer", "HR", 56);
        employees.ajouterEmploye(employee1);
        employees.ajouterEmploye(new Employee(2, "Bob","Loiu", "PMO", 89));
        employees.ajouterEmploye(new Employee(3, "Joyelle","Sant", "IT",90));
        employees.displayEmploye();
        System.out.println(employees.rechercherEmploye(employee1));
        System.out.println(employees.rechercherEmploye("Alice"));

        employees.trierEmployeParId();
        employees.trierEmployeParNomDépartementEtGrade();
        //employees.supprimerEmploye(employee1);


        
        
        

    }
}