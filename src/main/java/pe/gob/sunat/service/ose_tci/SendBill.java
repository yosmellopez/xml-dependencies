package pe.gob.sunat.service.ose_tci;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Clase Java para sendBill complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="sendBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contentFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "sendBill", propOrder = {"fileName", "contentFile"})
public class SendBill {

    protected String fileName;

    @XmlMimeType("application/octet-stream")
    protected DataHandler contentFile;

    /**
     * Obtiene el valor de la propiedad fileName.
     *
     * @return possible object is {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     *
     * @param value allowed object is {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obtiene el valor de la propiedad contentFile.
     *
     * @return possible object is {@link DataHandler }
     */
    public DataHandler getContentFile() {
        return contentFile;
    }

    /**
     * Define el valor de la propiedad contentFile.
     *
     * @param value allowed object is {@link DataHandler }
     */
    public void setContentFile(DataHandler value) {
        this.contentFile = value;
    }

}
