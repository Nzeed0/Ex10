/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap_clients;

/**
 *
 * @author Nzeed
 */
public class Controller_part {
    View_part view;
    
    public Controller_part(View_part view) {
        this.view = view;
        setControllerObject();
    }
    
    private void setControllerObject(){
        view.SetCtrObject(this);
    }
    
    public static String Calculating_Circumference(double radius){
        clients.Webservice_Service service = new clients.Webservice_Service();
        clients.Webservice port = service.getWebservicePort();
    return port.calculatingCircumference(radius);
    }
    
    public static String Calculating_Circle_Area(double radius){
        clients.Webservice_Service service = new clients.Webservice_Service();
        clients.Webservice port = service.getWebservicePort();
    return port.calCulatingCircleArea(radius);
    }
}
