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

        /*============================================================
        Prosit 10 Testing
        =============================================================*/
        System.out.println("==============================Testing Prosit 10 ===================================");
        DepartementHashSet departementManager = new DepartementHashSet();

        Departement dep1 = new Departement(1, "HR",200);
        Departement dep2 = new Departement(2, "Financial",120);
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
        System.out.println(departementManager.rechercherDepartement("Financial"));

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
        /*=======================================================
        Prosit 11 Testing
        =========================================================*/
        System.out.println("==============================Testing Prosit 11 ===================================");
        AffectationHashMap gestionAffectations = new AffectationHashMap();

        Employee employe1 = new Employee(1, "Alice", "Doe", "HR", 25);
        Employee employe2 = new Employee(2, "Bob", "Smith", "IT", 30);

        Departement depHR = new Departement(1, "HR", 200);
        Departement depFinancial = new Departement(2, "Financial", 100);


        /*-----------------------------------------------------------
          Affectation of Departements to Employees
         ------------------------------------------------------------*/
        System.out.println("/*-------------------------------------\n Affectation of Departements to Employees\n----------------------------------------------------*/");
        gestionAffectations.ajouterEmployeDepartement(employe1, depHR);
        gestionAffectations.ajouterEmployeDepartement(employe2, depFinancial);
        gestionAffectations.afficherEmployesEtDepartements();

        /*------------------------------------------------------------
        Affectation of the same Employee to another Departement
         --------------------------------------------------------------*/
        System.out.println("/*---------------------------------------\nAffectation of the same Employee to another Departement\n-----------------------------------*/");
        gestionAffectations.ajouterEmployeDepartement(employe1, depFinancial);
        gestionAffectations.afficherEmployesEtDepartements();

        /*-----------------------------------------------------------
        Display the Map after the recent Affectation
        ------------------------------------------------------------- */
        System.out.println("/*----------------------------\nDisplay the Map after the recent Affectation \n------------------------------------*/");
        gestionAffectations.afficherEmployesEtDepartements();

        /*-------------------------------------------------------------------------------------
        Observation For Instruction 3 Affectation of the same Employee to another Departement:
         During the first assignment:
           Each employee is correctly associated with their department.
           After adding the same employee (employe1) to another department (depFinancial):
           The HashMap replaces the previous department associated with the employee with the new one.
           This means an employee can only be linked to one department at a time.
        ---------------------------------------------------------------------------------------- */








    }
}