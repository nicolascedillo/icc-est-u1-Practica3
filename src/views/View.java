package views;

import java.util.Scanner;
import models.*;

public class View {

    private Scanner sc = new Scanner(System.in);

    //Muestra el menú en pantalla
    public int showMenu(){
        System.out.println("-----------Menu----------");
        System.out.println("Seleccione una opción: ");
        System.out.println("1: Ingresar personas");
        System.out.println("2: Ordenar personas");
        System.out.println("3: Buscar persona");
        System.out.println("4: Mostrar personas");
        System.out.println("0: Salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    //Ingresa una persona
    public Person inputPerson(){
        String nombre = inputName();
        int edad = inputAge();
        return new Person(nombre, edad);
    }

    //Selecciona un metodo de ordenamiento
    public int selecSortingMethod(){
        System.out.println("Seleccione método de ordenamiento: ");
        System.out.println("1: Burbuja por nombre");
        System.out.println("2: Selección por nombre");
        System.out.println("3: Inserción por edad");
        System.out.println("4: Inserción por nombre");
        int opcion = sc.nextInt();
        return opcion;
    }

    //Selecciona un metodo de busqueda
    public int selectSearchCriterion(){
        System.out.println("Seleccione método de busqueda: ");
        System.out.println("1: Binaria por edad");
        System.out.println("2: Binaria por nombre");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    //Imprime el arreglo de personas
    public void displayPersons(Person[] personas){
        System.out.println("Lista de personas");
        for (Person p:personas){
            System.out.println(p);
        }
    }

    //Muestra el resultado de la busqueda
    public void displaySearchResult(Person person){
        if (person != null) {
            System.out.println("Persona encontrada:");
            System.out.println(person);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
    
    //INgresa una edad
    public int inputAge(){
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        return edad;
    }

    //Ingresa un nombre
    public String inputName(){
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        return nombre;
    }
}
