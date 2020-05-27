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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT000001&lt;/ccts:UniqueID&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A number of monetary units specified in a currency where the unit of the currency is explicit or implied.&lt;/ccts:Definition&gt;
 * </pre>
 *
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 *
 *
 *
 * <p>Java class for AmountType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2>AmountType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType")
@XmlSeeAlso({
        TaxExclusiveAmountType.class,
        RequiredFeeAmountType.class,
        AverageSubsequentContractAmountType.class,
        PerUnitAmountType.class,
        DeclaredForCarriageValueAmountType.class,
        CallBaseAmountType.class,
        AdvertisementAmountType.class,
        TaxInclusiveAmountType.class,
        CorporateStockAmountType.class,
        MaximumAmountType.class,
        PaidAmountType.class,
        ThresholdAmountType.class,
        TaxAmountType.class,
        CorrectionAmountType.class,
        PayableAmountType.class,
        LiabilityAmountType.class,
        PayableAlternativeAmountType.class,
        TotalCreditAmountType.class,
        InsurancePremiumAmountType.class,
        PrepaidAmountType.class,
        PartyCapacityAmountType.class,
        TaxableAmountType.class,
        AllowanceTotalAmountType.class,
        PayableRoundingAmountType.class,
        TotalDebitAmountType.class,
        ValueAmountType.class,
        TotalTaskAmountType.class,
        InsuranceValueAmountType.class,
        AnnualAverageAmountType.class,
        DeclaredCustomsValueAmountType.class,
        MarketValueAmountType.class,
        MaximumPaidAmountType.class,
        MinimumAmountType.class,
        EstimatedOverallContractAmountType.class,
        oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType.class,
        TotalAmountType.class,
        DeclaredStatisticsValueAmountType.class,
        CallExtensionAmountType.class,
        LineExtensionAmountType.class,
        BalanceAmountType.class,
        TransactionCurrencyTaxAmountType.class,
        FaceValueAmountType.class,
        CorrectionUnitAmountType.class,
        MaximumAdvertisementAmountType.class,
        DeclaredCarriageValueAmountType.class,
        TotalBalanceAmountType.class,
        FeeAmountType.class,
        MaximumTaxInclusiveAmountType.class,
        TotalInvoiceAmountType.class,
        DebitLineAmountType.class,
        LowerTenderAmountType.class,
        PriceAmountType.class,
        FreeOnBoardValueAmountType.class,
        SettlementDiscountAmountType.class,
        AverageAmountType.class,
        RoundingAmountType.class,
        TotalPaymentAmountType.class,
        BaseAmountType.class,
        PenaltyAmountType.class,
        CreditLineAmountType.class,
        HigherTenderAmountType.class,
        ChargeTotalAmountType.class,
        TotalTaxAmountType.class,
        InventoryValueAmountType.class,
        MaximumTaxExclusiveAmountType.class
})
public class AmountType
        extends
        un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2.AmountType {


}
