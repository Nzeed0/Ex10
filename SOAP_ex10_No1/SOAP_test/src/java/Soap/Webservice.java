/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Nzeed
 */
@WebService(serviceName = "Webservice")
public class Webservice {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Calculating_Circumference")
    public String Calculating_Circumference(@WebParam(name = "radius") double radius) {
        double pi = 3.14159265359;
        double Answer = 2*radius*pi;
        return String.format("%.3f", Answer);
    }

    @WebMethod(operationName = "CalCulating_Circle_Area")
    public String CalCulating_Circle_Area(@WebParam(name = "radius") double radius) {
        double pi = 3.14159265359;
        double Answer = Math.pow(radius*pi, 2);
        return String.format("%.3f", Answer);
    }
    
    
}
