//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.21 at 10:10:40 AM PET 
//


package oasis.names.specification.ubl.schema.xsd.order_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.io.Serializable;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the oasis.names.specification.ubl.schema.xsd.order_2 package.
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


    private final static QName _Order_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:Order-2", "Order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.order_2
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderType }
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:Order-2", name = "Order")
    public JAXBElement<OrderType> createOrder(OrderType value) {
        return new JAXBElement<OrderType>(_Order_QNAME, OrderType.class, null, value);
    }

}
