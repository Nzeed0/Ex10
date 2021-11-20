package Controller;

import View.View_part;

public class Controller_part {
    View_part view;
    StudentController_Services StuController;
    
    public Controller_part(View_part view) {
        this.view = view;
        StuController = new StudentController_Services();
        setControllerObjetc();
    }
    
    private void setControllerObjetc(){
        view.setControllerObj(this, StuController);
    }
}
