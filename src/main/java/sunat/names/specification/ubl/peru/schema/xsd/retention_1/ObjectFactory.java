//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.21 at 10:15:08 AM PET 
//


package sunat.names.specification.ubl.peru.schema.xsd.retention_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.io.Serializable;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the oasis.names.specification.ubl.schema.xsd.invoice_2 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory implements Serializable {


    /**
     * Default serial version id
     */
    private static final long serialVersionUID = 1L;

    private final static QName _Retention_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:Retention-1", "Retention");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sunat.names.specification.ubl.peru.schema.xsd.retention_1
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerceptionType }
     */
    public RetentionType createRetentionType() {
        return new RetentionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerceptionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:Retention-1", name = "Retention")
    public JAXBElement<RetentionType> createRetentionType(RetentionType value) {
        return new JAXBElement<RetentionType>(_Retention_QNAME, RetentionType.class, null, value);
    }

}
