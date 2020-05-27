package pe.gob.sunat.service.ose_tci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStatusCdrResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="getStatusCdrResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://service.sunat.gob.pe}cdrStatusResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "getStatusCdrResponse", propOrder = {"status"})
public class GetStatusCdrResponse {

    protected CdrStatusResponse status;

    /**
     * Obtiene el valor de la propiedad status.
     *
     * @return possible object is
     * {@link CdrStatusResponse }
     */
    public CdrStatusResponse getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     *
     * @param value allowed object is
     *              {@link CdrStatusResponse }
     */
    public void setStatus(CdrStatusResponse value) {
        this.status = value;
    }

}
