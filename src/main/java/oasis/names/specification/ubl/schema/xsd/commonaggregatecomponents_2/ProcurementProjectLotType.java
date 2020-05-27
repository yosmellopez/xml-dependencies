//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.19 at 09:27:25 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Procurement Project Lot. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A division of a procurement project, set up to create different contracts allowing the contracting party to award different lots to different economic operators.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Procurement Project Lot&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 *
 *
 *
 * <p>Java class for ProcurementProjectLotType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProcurementProjectLotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProject"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcurementProjectLotType", propOrder = {
        "id",
        "tenderingTerms",
        "procurementProject"
})
public class ProcurementProjectLotType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;

    @XmlElement(name = "TenderingTerms")
    protected TenderingTermsType tenderingTerms;

    @XmlElement(name = "ProcurementProject", required = true)
    protected ProcurementProjectType procurementProject;

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Procurement Project Lot. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The unique identifier of this Procurement Project Lot.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Procurement Project Lot&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link IDType }
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link IDType }
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Procurement Project Lot. Tendering Terms&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Tendering terms for an specific procurement project lot.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Procurement Project Lot&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Tendering Terms&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Tendering Terms&lt;/ccts:AssociatedObjectClass&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link TenderingTermsType }
     */
    public TenderingTermsType getTenderingTerms() {
        return tenderingTerms;
    }

    /**
     * Sets the value of the tenderingTerms property.
     *
     * @param value allowed object is
     *              {@link TenderingTermsType }
     */
    public void setTenderingTerms(TenderingTermsType value) {
        this.tenderingTerms = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Procurement Project Lot. Procurement Project&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The goods or the service which is the subject to be procured in the tendering process.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Procurement Project Lot&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Procurement Project&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Procurement Project&lt;/ccts:AssociatedObjectClass&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link ProcurementProjectType }
     */
    public ProcurementProjectType getProcurementProject() {
        return procurementProject;
    }

    /**
     * Sets the value of the procurementProject property.
     *
     * @param value allowed object is
     *              {@link ProcurementProjectType }
     */
    public void setProcurementProject(ProcurementProjectType value) {
        this.procurementProject = value;
    }

}
