package homework12.controller;
import homework12.services.MainService;

public class MainController {
    private final MainService mainService;

    public MainController() {
        this.mainService = new MainService();
    }

    public String help() {
        return mainService.menuContent();
    }
}
