package pe.gob.sunat.service.ose_tci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStatusCdr complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="getStatusCdr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rucComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serieComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroComprobante" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "getStatusCdr", propOrder = {"rucComprobante", "tipoComprobante", "serieComprobante", "numeroComprobante"})
public class GetStatusCdr {

    protected String rucComprobante;

    protected String tipoComprobante;

    protected String serieComprobante;

    protected Integer numeroComprobante;

    /**
     * Obtiene el valor de la propiedad rucComprobante.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRucComprobante() {
        return rucComprobante;
    }

    /**
     * Define el valor de la propiedad rucComprobante.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRucComprobante(String value) {
        this.rucComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad serieComprobante.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSerieComprobante() {
        return serieComprobante;
    }

    /**
     * Define el valor de la propiedad serieComprobante.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSerieComprobante(String value) {
        this.serieComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprobante.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Define el valor de la propiedad numeroComprobante.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNumeroComprobante(Integer value) {
        this.numeroComprobante = value;
    }

}
