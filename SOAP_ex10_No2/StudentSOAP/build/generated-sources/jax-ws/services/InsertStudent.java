
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InsertStudent complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InsertStudent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="stu" type="{http://services/}student" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertStudent", propOrder = {
    "stu"
})
public class InsertStudent {

    protected Student stu;

    /**
     * Gets the value of the stu property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStu() {
        return stu;
    }

    /**
     * Sets the value of the stu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStu(Student value) {
        this.stu = value;
    }

}
