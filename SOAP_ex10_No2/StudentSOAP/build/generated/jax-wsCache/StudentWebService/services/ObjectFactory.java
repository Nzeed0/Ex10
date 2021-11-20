
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertStudent_QNAME = new QName("http://services/", "InsertStudent");
    private final static QName _InsertStudentResponse_QNAME = new QName("http://services/", "InsertStudentResponse");
    private final static QName _FindStudentByID_QNAME = new QName("http://services/", "findStudentByID");
    private final static QName _FindStudentByIDResponse_QNAME = new QName("http://services/", "findStudentByIDResponse");
    private final static QName _FindStudentByName_QNAME = new QName("http://services/", "findStudentByName");
    private final static QName _FindStudentByNameResponse_QNAME = new QName("http://services/", "findStudentByNameResponse");
    private final static QName _RemoveStudent_QNAME = new QName("http://services/", "removeStudent");
    private final static QName _Student_QNAME = new QName("http://services/", "student");
    private final static QName _UpdateStudent_QNAME = new QName("http://services/", "updateStudent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertStudent }
     * 
     */
    public InsertStudent createInsertStudent() {
        return new InsertStudent();
    }

    /**
     * Create an instance of {@link InsertStudentResponse }
     * 
     */
    public InsertStudentResponse createInsertStudentResponse() {
        return new InsertStudentResponse();
    }

    /**
     * Create an instance of {@link FindStudentByID }
     * 
     */
    public FindStudentByID createFindStudentByID() {
        return new FindStudentByID();
    }

    /**
     * Create an instance of {@link FindStudentByIDResponse }
     * 
     */
    public FindStudentByIDResponse createFindStudentByIDResponse() {
        return new FindStudentByIDResponse();
    }

    /**
     * Create an instance of {@link FindStudentByName }
     * 
     */
    public FindStudentByName createFindStudentByName() {
        return new FindStudentByName();
    }

    /**
     * Create an instance of {@link FindStudentByNameResponse }
     * 
     */
    public FindStudentByNameResponse createFindStudentByNameResponse() {
        return new FindStudentByNameResponse();
    }

    /**
     * Create an instance of {@link RemoveStudent }
     * 
     */
    public RemoveStudent createRemoveStudent() {
        return new RemoveStudent();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     * 
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertStudent")
    public JAXBElement<InsertStudent> createInsertStudent(InsertStudent value) {
        return new JAXBElement<InsertStudent>(_InsertStudent_QNAME, InsertStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsertStudentResponse")
    public JAXBElement<InsertStudentResponse> createInsertStudentResponse(InsertStudentResponse value) {
        return new JAXBElement<InsertStudentResponse>(_InsertStudentResponse_QNAME, InsertStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByID")
    public JAXBElement<FindStudentByID> createFindStudentByID(FindStudentByID value) {
        return new JAXBElement<FindStudentByID>(_FindStudentByID_QNAME, FindStudentByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByIDResponse")
    public JAXBElement<FindStudentByIDResponse> createFindStudentByIDResponse(FindStudentByIDResponse value) {
        return new JAXBElement<FindStudentByIDResponse>(_FindStudentByIDResponse_QNAME, FindStudentByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByName")
    public JAXBElement<FindStudentByName> createFindStudentByName(FindStudentByName value) {
        return new JAXBElement<FindStudentByName>(_FindStudentByName_QNAME, FindStudentByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByNameResponse")
    public JAXBElement<FindStudentByNameResponse> createFindStudentByNameResponse(FindStudentByNameResponse value) {
        return new JAXBElement<FindStudentByNameResponse>(_FindStudentByNameResponse_QNAME, FindStudentByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "removeStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

}
