import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList employees=new SocieteArrayList();
        Employee employee1=new Employee(1, "Alice","Jenyer", "HR", 56);
        employees.ajouterEmploye(employee1);
        employees.ajouterEmploye(new Employee(2, "Bob","Loiu", "PMO", 89));
        employees.ajouterEmploye(new Employee(3, "Joyelle","Sant", "IT",90));
        /*----------------------------------------------------
        List of Employees before sort
         ------------------------------------------------------*/
        System.out.println("/*---------------------------------------------\n   List of Employees Before Sort\n-----------------------------------------------*/");
        employees.displayEmploye();
        /* Search employees */
        System.out.println(employees.rechercherEmploye(employee1));
        System.out.println(employees.rechercherEmploye("Alice"));
         /*------------------------------------------------------------
         Implement sorting of a list of employees by ID
         ------------------------------------------------------------- */
        System.out.println("/*------------------------------------------------------------\n  implement sorting of a list of employees by ID \n ------------------------------------------------------------- */");
        employees.trierEmployeParId();
        /*------------------------------------------------------------
         Implement sorting of a list of employees by Name of the Departement and Grades
         ------------------------------------------------------------- */
        System.out.println("/*------------------------------------------------------------\n  implement sorting of a list of employees by Name of the Departement and Grades \n ------------------------------------------------------------- */");
        employees.trierEmployeParNomDépartementEtGrade();
        //employees.supprimerEmploye(employee1);

        /*------------------------------------------------------
        Prosit 10 Testing
         --------------------------------------------------------*/
        DepartementHashSet departementManager = new DepartementHashSet();

        Departement dep1 = new Departement(1, "HR",200);
        Departement dep2 = new Departement(2, "Finance",120);
        Departement dep3 = new Departement(3, "IT",300);


        departementManager.ajouterDepartement(dep1);
        departementManager.ajouterDepartement(dep2);
        departementManager.ajouterDepartement(dep3);

        /*-------------------------------------------
        Display all departments before sorting by ID
         -------------------------------------------*/
        System.out.println("/*------------------------------\n All Departments \n -----------------------------------*/");
        departementManager.displayDepartement();

        /*-----------------------------------------------------
        Search for a department by name
        -------------------------------------------------------- */
        System.out.println("/*-------------------------------\n Searching for departement by Name \n ---------------------------*/");
        System.out.println(departementManager.rechercherDepartement("Finance"));

        /*------------------------------------------------
        Remove a department
        -------------------------------------------------- */
        System.out.println("/*----------------------------------\nRemoving  a department \n ----------------------------------*/");
        departementManager.supprimerDepartement(dep3);
        departementManager.displayDepartement();

        /*-------------------------------------------------
        Sort departments by ID
         --------------------------------------------------*/
        System.out.println("/* --------------------------------------\n Departments sorted by ID\n ------------------------------------*/");
        TreeSet<Departement> sortedDepartments = departementManager.trierDepartementById();
        for (Departement d : sortedDepartments) {
            System.out.println(d);
        }


        
        
        

    }
}