//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.21 at 10:15:47 AM PET 
//


package sunat.names.specification.ubl.peru.schema.xsd.summarydocuments_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.io.Serializable;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the sunat.names.specification.ubl.peru.schema.xsd.summarydocuments_1 package.
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

    private final static QName _SummaryDocuments_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SummaryDocuments-1", "SummaryDocuments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sunat:names:specification:ubl:peru:schema:xsd:SummaryDocuments-1
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SummaryDocumentsType }
     */
    public SummaryDocumentsType createCreditNoteType() {
        return new SummaryDocumentsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryDocumentsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SummaryDocuments-1", name = "SummaryDocuments")
    public JAXBElement<SummaryDocumentsType> createVoidedDocuments(SummaryDocumentsType value) {
        return new JAXBElement<SummaryDocumentsType>(_SummaryDocuments_QNAME, SummaryDocumentsType.class, null, value);
    }

} //ObjectFactory
