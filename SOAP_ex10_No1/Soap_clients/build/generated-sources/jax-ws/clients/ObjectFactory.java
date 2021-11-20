
package clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clients package. 
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

    private final static QName _CalCulatingCircleArea_QNAME = new QName("http://Soap/", "CalCulating_Circle_Area");
    private final static QName _CalCulatingCircleAreaResponse_QNAME = new QName("http://Soap/", "CalCulating_Circle_AreaResponse");
    private final static QName _CalculatingCircumference_QNAME = new QName("http://Soap/", "Calculating_Circumference");
    private final static QName _CalculatingCircumferenceResponse_QNAME = new QName("http://Soap/", "Calculating_CircumferenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalCulatingCircleArea }
     * 
     */
    public CalCulatingCircleArea createCalCulatingCircleArea() {
        return new CalCulatingCircleArea();
    }

    /**
     * Create an instance of {@link CalCulatingCircleAreaResponse }
     * 
     */
    public CalCulatingCircleAreaResponse createCalCulatingCircleAreaResponse() {
        return new CalCulatingCircleAreaResponse();
    }

    /**
     * Create an instance of {@link CalculatingCircumference }
     * 
     */
    public CalculatingCircumference createCalculatingCircumference() {
        return new CalculatingCircumference();
    }

    /**
     * Create an instance of {@link CalculatingCircumferenceResponse }
     * 
     */
    public CalculatingCircumferenceResponse createCalculatingCircumferenceResponse() {
        return new CalculatingCircumferenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCulatingCircleArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalCulatingCircleArea }{@code >}
     */
    @XmlElementDecl(namespace = "http://Soap/", name = "CalCulating_Circle_Area")
    public JAXBElement<CalCulatingCircleArea> createCalCulatingCircleArea(CalCulatingCircleArea value) {
        return new JAXBElement<CalCulatingCircleArea>(_CalCulatingCircleArea_QNAME, CalCulatingCircleArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCulatingCircleAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalCulatingCircleAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Soap/", name = "CalCulating_Circle_AreaResponse")
    public JAXBElement<CalCulatingCircleAreaResponse> createCalCulatingCircleAreaResponse(CalCulatingCircleAreaResponse value) {
        return new JAXBElement<CalCulatingCircleAreaResponse>(_CalCulatingCircleAreaResponse_QNAME, CalCulatingCircleAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatingCircumference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculatingCircumference }{@code >}
     */
    @XmlElementDecl(namespace = "http://Soap/", name = "Calculating_Circumference")
    public JAXBElement<CalculatingCircumference> createCalculatingCircumference(CalculatingCircumference value) {
        return new JAXBElement<CalculatingCircumference>(_CalculatingCircumference_QNAME, CalculatingCircumference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatingCircumferenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculatingCircumferenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Soap/", name = "Calculating_CircumferenceResponse")
    public JAXBElement<CalculatingCircumferenceResponse> createCalculatingCircumferenceResponse(CalculatingCircumferenceResponse value) {
        return new JAXBElement<CalculatingCircumferenceResponse>(_CalculatingCircumferenceResponse_QNAME, CalculatingCircumferenceResponse.class, null, value);
    }

}
