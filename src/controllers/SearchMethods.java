package controllers;

import models.*;

public class SearchMethods {

    //Busca con busqueda binaria a una persona por una edad especifica
    public Person binarySearchByAge (Person[] personas, int edad){
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo<=alto){
            int central = bajo + (alto-bajo)/2;
            if(personas[central].getAge() == edad){
                return personas[central];
            }
            if(personas[central].getAge() < edad){
                bajo = central +1;
            } else{
                alto = central -1;
            }
        }
        return null;
    }

    //Busca con una busqueda binaria a una persona por un nombre espeecífico
    public Person binarySearchByName (Person[] personas, String nombre){
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo<=alto){
            int central = bajo + (alto-bajo)/2;
            if(personas[central].getName().compareTo(nombre) == 0){
                return personas[central];
            }
            if(personas[central].getName().compareTo(nombre) < 0){
                bajo = central +1;
            } else{
                alto = central -1;
            }
        }
        return null;
    }

    //Comprueba si el arreglo está ordenado por nombre
    public boolean isSortedByName (Person[] personas){
        int n = personas.length;
        for (int i = 0; i<n-1; i++){
            if (personas[i].getName().compareTo(personas[i+1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }

    //Comprueba si el arreglo está ordenado por edad
    public boolean isSortedByAge (Person[] personas){
        int n = personas.length;
        for (int i = 0; i<n-1; i++){
            if (personas[i].getAge() > personas[i+1].getAge()) {
                return false;
            }
        }
        return true;
    }
}
