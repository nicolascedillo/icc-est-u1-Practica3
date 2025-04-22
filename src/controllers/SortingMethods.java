package controllers;

import models.*;

public class SortingMethods {

    public void sortByNameWithBubble(Person[] personas){
        int n = personas.length;
        for (int i = 0; i < n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if (personas[j].getName().compareTo(personas[j+1].getName()) > 0){
                    Person temp = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = temp;
                }
            }
        }
    }

    public void sortByNameWithSelection(Person[] personas){
        int n = personas.length;
        for (int i = 0; i<n-1;i++){
            int indx = i;
            for(int j= i+1; j<n;j++){
                if(personas[indx].getName().compareTo(personas[j].getName()) > 0){
                    indx = j;
                }
            }
            if (indx != i){
                Person temp = personas[indx];
                personas[indx] = personas[i];
                personas[i] = temp;
            }
        }
    }

    public void sortByNameWithInsertion(Person[] personas){
        int n = personas.length;
        for (int i = 1; i<n; i++){
            Person aux = personas[i];
            int j = i-1;
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) < 0) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }

    public void sortByAgeWithInsertion(Person[] personas){
        int n = personas.length;
        for (int i = 1; i<n; i++){
            Person aux = personas[i];
            int j = i-1;
            while (j >= 0 && personas[j].getAge() < aux.getAge() ) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;
        }

    }
}
