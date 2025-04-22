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
    }

    public void start(){
        
    }
    
}
