/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import DataBase_Controller.Student;
import java.util.List;
import javax.jws.Oneway;
import javax.persistence.Query;
/**
 *
 * @author Nzeed
 */
@WebService(serviceName = "StudentWebService")
public class StudentWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_SOAPPU");

    @WebMethod(operationName = "InsertStudent")
    public void InsertStudent(@WebParam(name = "stu") Student stu) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(stu);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    @WebMethod(operationName = "updateStudent")
    @Oneway
    public void updateStudent(@WebParam(name = "stu") Student stu) {
        EntityManager em = emf.createEntityManager();
        Student fromDb = em.find(Student.class, stu.getId());
        fromDb.setName(stu.getName());
        fromDb.setGpa(stu.getGpa());
        try {
            em.getTransaction().begin();
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    @WebMethod(operationName = "findStudentByID")
    public Student findStudentByID(@WebParam(name = "id") int id) {
        EntityManager em = emf.createEntityManager();
        Student stu = em.find(Student.class, id);
        em.close();
        return stu;
    }

    @WebMethod(operationName = "findStudentByName")
    public List<Student> findStudentByName(@WebParam(name = "name") String name) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findByName");
        query.setParameter("name", name);
        List<Student> stuList = (List<Student>)query.getResultList();
        em.close();
        return stuList;
    }

    @WebMethod(operationName = "removeStudent")
    @Oneway
    public void removeStudent(@WebParam(name = "stu") Student stu) {
     EntityManager em = emf.createEntityManager();
        Student fromDb = em.find(Student.class, stu.getId());
        try {
            em.getTransaction().begin();
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        } 
    }
    
}
