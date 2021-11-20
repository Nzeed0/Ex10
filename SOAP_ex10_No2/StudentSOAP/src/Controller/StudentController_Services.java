package Controller;

import java.util.List;
import services.Student;

public class StudentController_Services {
    
    public static void InsertStudent(Student stu){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        port.insertStudent(stu);
    }
    
    public static void updateStudent(Student stu){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        port.updateStudent(stu);
    }
    
    public static Student findStudentByID(int id){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentByID(id);
    }
    
    public static List<Student> findStudentByName(String name){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentByName(name);
    }
    
    public static void removeStudent(Student stu){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        port.removeStudent(stu);
    }
}
