package pe.gob.sunat.service.ose_tci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cdrStatusResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="cdrStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cdrStatusResponse", propOrder = {"content", "statusCode", "statusMessage"})
public class CdrStatusResponse {

    protected byte[] content;

    protected String statusCode;

    protected String statusMessage;

    /**
     * Obtiene el valor de la propiedad content.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Define el valor de la propiedad content.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusMessage.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Define el valor de la propiedad statusMessage.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

}
