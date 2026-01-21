import menu.Menu;
import menu.ClinicMenu;
public class Main {
    public static void main(String[] args) {
        Menu menu = new ClinicMenu();
        menu.run();
    }
}