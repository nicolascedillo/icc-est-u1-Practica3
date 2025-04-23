package controllers;

import views.*;
import models.*;

public class Controller {
    private View view;
    private Person[] personas;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    //Constructor
    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.personas = new Person[10];
    }

    public void start(){
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion = view.showMenu();
            switch (opcion) {
                case 1:
                 inputPersons();
                 break;
                case 2:
                 sortPersons();
                 break;
                case 3:
                 searchPerson();
                 break;
                case 4: {
                    view.displayPersons(personas);
                    break;
                }
                case 0:
                 ejecutando = false;
                 break;
                default:
                 System.out.println("Ingrese una ocpción valida");
            }
        }
    }

    public void inputPersons(){
        System.out.println("Ingrese 10 personas: ");
        for (int i = 0; i<10;i++){
            personas[i]= view.inputPerson();
        }
    }

    public void sortPersons() {
        int opcion = view.selecSortingMethod();
        switch (opcion) {
            case 1:
             sortingMethods.sortByNameWithBubble(personas);
             break;
            case 2:
             sortingMethods.sortByNameWithSelection(personas);
             break;
            case 3:
             sortingMethods.sortByAgeWithInsertion(personas);
             break;
            case 4:
             sortingMethods.sortByNameWithInsertion(personas);
             break;
            default:
             System.out.println("Opción inválida.");
        }
    }

    public void searchPerson() {
        int criterio = view.selectSearchCriterion();
        if (criterio == 1) { 

            if (!searchMethods.isSortedByAge(personas)) {
                System.out.println("No esta ordenada por edad");
                return;
            }

            int edad = view.inputAge();
            Person resultado = searchMethods.binarySearchByAge(personas, edad);
            view.displaySearchResult(resultado);

        } else if (criterio == 2) {

            if (!searchMethods.isSortedByName(personas)) {
                System.out.println("No está ordenada por nombre");
                return;
            }

            String nombre = view.inputName();
            Person resultado = searchMethods.binarySearchByName(personas, nombre);
            view.displaySearchResult(resultado);

        } else {

            System.out.println("Ingrese 1 o 2");
        }
    }
    
}
