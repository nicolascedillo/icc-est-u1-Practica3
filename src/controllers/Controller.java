package controllers;

import views.*;

import java.util.Scanner;

import models.*;

public class Controller {
    private View view;
    private Person[] personas;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Scanner sc = new Scanner(System.in);
    private int cantidad;

    //Constructor
    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods, int cantidad) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.cantidad = cantidad;
        this.personas = new Person[cantidad];
    }

    //Start del programa
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

    //Guarda las personas en el arreglo
    public void inputPersons(){
        
        for (int i = 0; i<getCantidad();i++){
            personas[i]= view.inputPerson();
        }
    }

    //Ordena las personas según se quiera
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
             System.out.println("Opción invalida.");
             break;
        }
    }

    //Aplica busqueda binaria para encontrar a la persona, antes verifica si ya está ordenado
    public void searchPerson() {
        int metodo = view.selectSearchCriterion();
        if (metodo == 1) { 

            if (!searchMethods.isSortedByAge(personas)) {
                System.out.println("No esta ordenada por edad");
                return;
            }

            int edad = view.inputAge();
            Person resultado = searchMethods.binarySearchByAge(personas, edad);
            view.displaySearchResult(resultado);

        } else if (metodo == 2) {

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
