//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.26 às 04:23:12 AM BRT 
//
package jaxbmodels;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registration_number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="registration_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port_test" type="{}port_test"/>
 *         &lt;element name="math_test" type="{}math_test"/>
 *         &lt;element name="spec_test" type="{}spec_test"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrationNumber",
    "registrationDate",
    "position",
    "portTest",
    "mathTest",
    "specTest"
})
@XmlRootElement(name = "candidate")
public class Candidate {

    @XmlElement(name = "registration_number", required = true)
    protected BigInteger registrationNumber;
    @XmlElement(name = "registration_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(required = true)
    protected String position;
    @XmlElement(name = "port_test", required = true)
    protected PortTest portTest;
    @XmlElement(name = "math_test", required = true)
    protected MathTest mathTest;
    @XmlElement(name = "spec_test", required = true)
    protected SpecTest specTest;

    /**
     * Obtém o valor da propriedade registrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Define o valor da propriedade registrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegistrationNumber(BigInteger value) {
        this.registrationNumber = value;
    }

    /**
     * Obtém o valor da propriedade registrationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Define o valor da propriedade registrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Obtém o valor da propriedade position.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Define o valor da propriedade position.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Obtém o valor da propriedade portTest.
     * 
     * @return
     *     possible object is
     *     {@link PortTest }
     *     
     */
    public PortTest getPortTest() {
        return portTest;
    }

    /**
     * Define o valor da propriedade portTest.
     * 
     * @param value
     *     allowed object is
     *     {@link PortTest }
     *     
     */
    public void setPortTest(PortTest value) {
        this.portTest = value;
    }

    /**
     * Obtém o valor da propriedade mathTest.
     * 
     * @return
     *     possible object is
     *     {@link MathTest }
     *     
     */
    public MathTest getMathTest() {
        return mathTest;
    }

    /**
     * Define o valor da propriedade mathTest.
     * 
     * @param value
     *     allowed object is
     *     {@link MathTest }
     *     
     */
    public void setMathTest(MathTest value) {
        this.mathTest = value;
    }

    /**
     * Obtém o valor da propriedade specTest.
     * 
     * @return
     *     possible object is
     *     {@link SpecTest }
     *     
     */
    public SpecTest getSpecTest() {
        return specTest;
    }

    /**
     * Define o valor da propriedade specTest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecTest }
     *     
     */
    public void setSpecTest(SpecTest value) {
        this.specTest = value;
    }

}
