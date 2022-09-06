package homework12.services;
import homework12.Menu;
public class MainService {
    public String menuContent() {
        return new Menu().show();
    }
}
