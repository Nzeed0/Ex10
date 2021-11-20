package Main;

import View.View_part;
import Controller.*;

public class StudentSOAP {

    public static void main(String[] args) {
        View_part view = new View_part();
        Controller_part controller = new Controller_part(view);
        view.setVisible(true);
    }
}
