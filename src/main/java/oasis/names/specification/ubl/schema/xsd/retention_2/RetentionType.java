package oasis.names.specification.ubl.schema.xsd.retention_2;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SignatureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.*;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.UBLExtensionsType;
import sunat.names.specification.ubl.peru.schema.xsd.sunataggregatecomponents_1.SUNATRetentionDocumentReferenceType;
import sunat.names.specification.ubl.peru.schema.xsd.sunataggregatecomponents_1.SUNATRetentionPercentType;
import sunat.names.specification.ubl.peru.schema.xsd.sunataggregatecomponents_1.SUNATRetentionSystemCodeType;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:Perception-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Invoice. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The document used to request payment.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Invoice&lt;/ccts:ObjectClass&gt;
 *         &lt;/ccts:Component&gt;
 * </pre>
 *
 *
 *
 * <p>Java class for InvoiceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RetentionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UBLVersionID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomizationID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AgentParty" minOccurs="0"/>
 * 		   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiverParty" minOccurs="0"/>
 * 		   &lt;element ref="{urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1}SUNATRetentionSystemCode" minOccurs="0"/>
 * 		   &lt;element ref="{urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1}SUNATRetentionPercent" minOccurs="0"/>
 * 		   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" minOccurs="0"/>
 * 		   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalInvoiceAmount" minOccurs="0"/>
 * 		   &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalPaid" minOccurs="0"/>
 * 		   &lt;element ref="{urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1}SUNATRetentionDocumentReference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionType", propOrder = {
        "ublExtensions",
        "ublVersionID",
        "customizationID",
        "id",
        "issueDate",
        "signature",
        "agentParty",
        "receiverParty",
        "sunatRetentionSystemCode",
        "sunatRetentionPercent",
        "note",
        "totalInvoiceAmount",
        "totalPaid",
        "sunatRetentionDocumentReference"

})
@XmlRootElement(name = "Retention")
public class RetentionType implements Serializable {

    private static final long serialVersionUID = 1L;


    @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UBLVersionIDType ublVersionID;

    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomizationIDType customizationID;

    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;

    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IssueDateType issueDate;

    @XmlElement(name = "AgentParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected PartyType agentParty;

    @XmlElement(name = "ReceiverParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected PartyType receiverParty;

    @XmlElement(name = "SUNATRetentionSystemCode", namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1")
    protected SUNATRetentionSystemCodeType sunatRetentionSystemCode;

    @XmlElement(name = "SUNATRetentionPercent", namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1")
    protected SUNATRetentionPercentType sunatRetentionPercent;

    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NoteType note;

    @XmlElement(name = "TotalInvoiceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalInvoiceAmountType totalInvoiceAmount;

    @XmlElement(name = "TotalPaid", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TotalPaidType totalPaid;

    @XmlElement(name = "SUNATRetentionDocumentReference", namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1")
    protected List<SUNATRetentionDocumentReferenceType> sunatRetentionDocumentReference;

    @XmlElement(name = "Signature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected SignatureType signature;


    public UBLVersionIDType getUblVersionID() {
        return ublVersionID;
    }

    public void setUblVersionID(UBLVersionIDType ublVersionID) {
        this.ublVersionID = ublVersionID;
    }

    public CustomizationIDType getCustomizationID() {
        return customizationID;
    }

    public void setCustomizationID(CustomizationIDType customizationID) {
        this.customizationID = customizationID;
    }

    public UBLExtensionsType getUblExtensions() {
        return ublExtensions;
    }

    public void setUblExtensions(UBLExtensionsType ublExtensions) {
        this.ublExtensions = ublExtensions;
    }

    public IDType getId() {
        return id;
    }

    public void setId(IDType id) {
        this.id = id;
    }

    public IssueDateType getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(IssueDateType issueDate) {
        this.issueDate = issueDate;
    }

    public PartyType getAgentParty() {
        return agentParty;
    }

    public void setAgentParty(PartyType agentParty) {
        this.agentParty = agentParty;
    }

    public PartyType getReceiverParty() {
        return receiverParty;
    }

    public void setReceiverParty(PartyType receiverParty) {
        this.receiverParty = receiverParty;
    }

    public SUNATRetentionSystemCodeType getSunatRetentionSystemCode() {
        return sunatRetentionSystemCode;
    }

    public void setSunatRetentionSystemCode(
            SUNATRetentionSystemCodeType sunatRetentionSystemCode) {
        this.sunatRetentionSystemCode = sunatRetentionSystemCode;
    }

    public SUNATRetentionPercentType getSunatRetentionPercent() {
        return sunatRetentionPercent;
    }

    public void setSunatRetentionPercent(
            SUNATRetentionPercentType sunatRetentionPercent) {
        this.sunatRetentionPercent = sunatRetentionPercent;
    }

    public NoteType getNote() {
        return note;
    }

    public void setNote(NoteType note) {
        this.note = note;
    }

    public oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalInvoiceAmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    public void setTotalInvoiceAmount(
            oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalInvoiceAmountType totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }

    public TotalPaidType getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(TotalPaidType totalPaid) {
        this.totalPaid = totalPaid;
    }

    public List<SUNATRetentionDocumentReferenceType> getSunatRetentionDocumentReference() {
        return sunatRetentionDocumentReference;
    }

    public void setSunatRetentionDocumentReference(
            List<SUNATRetentionDocumentReferenceType> sunatRetentionDocumentReference) {
        this.sunatRetentionDocumentReference = sunatRetentionDocumentReference;
    }

    public SignatureType getSignature() {
        return signature;
    }

    public void setSignature(SignatureType signature) {
        this.signature = signature;
    }

}
