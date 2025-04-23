
import controllers.*;
import views.*;
import models.*;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        Controller controller = new Controller(view, sortingMethods, searchMethods);

        controller.start();
    }
}
