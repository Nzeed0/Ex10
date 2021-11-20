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
public class Main_part {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View_part view = new View_part();
        Controller_part Controller = new Controller_part(view);
        view.setVisible(true);
    }
    
}
