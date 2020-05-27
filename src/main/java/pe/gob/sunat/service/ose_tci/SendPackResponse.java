package pe.gob.sunat.service.ose_tci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sendPackResponse complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="sendPackResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "sendPackResponse", propOrder = {"ticket"})
public class SendPackResponse {

    protected String ticket;

    /**
     * Obtiene el valor de la propiedad ticket.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Define el valor de la propiedad ticket.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

}