
import java.util.Scanner;

import controllers.*;
import views.*;
import models.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas en el arreglo");
        int cantidad = sc.nextInt();

        Controller controller = new Controller(view, sortingMethods, searchMethods, cantidad);

        controller.start();
    }
}
