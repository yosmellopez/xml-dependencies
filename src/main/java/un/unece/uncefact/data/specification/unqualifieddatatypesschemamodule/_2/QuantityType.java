//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.19 at 09:27:25 AM COT 
//


package un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000018&lt;/ccts:UniqueID&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units possibly including fractions.&lt;/ccts:Definition&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 *
 *
 *
 * <p>Java class for QuantityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QuantityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>QuantityType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType")
@XmlSeeAlso({
        ExpectedOperatorQuantityType.class,
        MaximumOrderQuantityType.class,
        MaximumBackorderQuantityType.class,
        MinimumInventoryQuantityType.class,
        SharesNumberQuantityType.class,
        PerformanceValueQuantityType.class,
        ConsignmentQuantityType.class,
        BasicConsumedQuantityType.class,
        OutstandingQuantityType.class,
        VarianceQuantityType.class,
        EstimatedConsumptedQuantityType.class,
        PreviousMeterQuantityType.class,
        DebitedQuantityType.class,
        TotalPackagesQuantityType.class,
        EmployeeQuantityType.class,
        RejectedQuantityType.class,
        TotalConsumedQuantityType.class,
        PackQuantityType.class,
        BackorderQuantityType.class,
        ReturnableQuantityType.class,
        TotalMeteredQuantityType.class,
        PriceAmountQuantityType.class,
        NormalTemperatureReductionQuantityType.class,
        ConsumerUnitQuantityType.class,
        MaximumOperatorQuantityType.class,
        MaximumVariantQuantityType.class,
        BatchQuantityType.class,
        CreditedQuantityType.class,
        TotalDeliveredQuantityType.class,
        ThresholdQuantityType.class,
        BaseQuantityType.class,
        TotalConsumptedQuantityType.class,
        ReceivedTenderQuantityType.class,
        MinimumBackorderQuantityType.class,
        ActualTemperatureReductionQuantityType.class,
        DeliveredQuantityType.class,
        ShortQuantityType.class,
        ContentUnitQuantityType.class,
        GasPressureQuantityType.class,
        ValueQuantityType.class,
        InvoicedQuantityType.class,
        DifferenceTemperatureReductionQuantityType.class,
        TargetInventoryQuantityType.class,
        TotalGoodsItemQuantityType.class,
        ChargeableQuantityType.class,
        MinimumOrderQuantityType.class,
        TimeDeltaDaysQuantityType.class,
        ReceivedQuantityType.class,
        TotalTransportHandlingUnitQuantityType.class,
        CustomsTariffQuantityType.class,
        ExpectedQuantityType.class,
        MaximumQuantityType.class,
        MinimumQuantityType.class,
        OversupplyQuantityType.class,
        OperatingYearsQuantityType.class,
        TimeAmountQuantityType.class,
        ConsumptionEnergyQuantityType.class,
        ConsumptionWaterQuantityType.class,
        MultipleOrderQuantityType.class,
        LatestMeterQuantityType.class,
        oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType.class,
        TotalPackageQuantityType.class
})
public class QuantityType
        extends un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.QuantityType {


}