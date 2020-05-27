package pe.gob.sunat.service.consult;

import lombok.extern.slf4j.Slf4j;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2015-10-29T20:46:42.626+01:00
 * Generated source version: 3.0.5
 */
@Slf4j
@WebServiceClient(name = "billConsultService",
        targetNamespace = "http://service.ws.consulta.comppago.electronico.registro.servicio2.sunat.gob.pe/",
        wsdlLocation = "https://www.sunat.gob.pe/ol-it-wsconscpegem/billConsultService?wsdl")
public class BillConsultService extends Service {

    public final static QName SERVICE = new QName("http://service.ws.consulta.comppago.electronico.registro.servicio2.sunat.gob.pe/", "billConsultService");

    public final static QName BillConsultServicePort = new QName("http://service.ws.consulta.comppago.electronico.registro.servicio2.sunat.gob.pe/", "BillConsultServicePort");

    /**
     * Constructor for BillConsultService class.
     *
     * @param wsdlLocation WSDL location input.
     */
    public BillConsultService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
        if (log.isDebugEnabled()) {
            log.debug("+-BillConsultService(URL) URL Production-WS: " + wsdlLocation);
        }
    }

    /**
     * Constructor for BillConsultService class.
     *
     * @param wsdlLocation WSDL location input.
     * @param serviceName  Service name input.
     */
    public BillConsultService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
        if (log.isDebugEnabled()) {
            log.debug("+-BillConsultService(URL, QName) URL Production-WS: " + wsdlLocation);
        }
    }

    /**
     * Constructor for BillConsultService class.
     *
     * @param wsdlLocation WSDL location input.
     * @param features     Web service feature input.
     */
    public BillConsultService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
        if (log.isDebugEnabled()) {
            log.debug("+-BillConsultService(URL, WebServiceFeature...) URL Production-WS: " + wsdlLocation);
        }
    }

    /**
     * Constructor for BillConsultService class.
     *
     * @param wsdlLocation WSDL location input.
     * @param serviceName  Service name input.
     * @param features     Web service feature input.
     */
    public BillConsultService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
        if (log.isDebugEnabled()) {
            log.debug("+-BillConsultService(URL, QName, WebServiceFeature...) URL Production-WS: " + wsdlLocation);
        }
    }

    /**
     * This method gets the bill service port.
     *
     * @return Returns the bill service port.
     */
    @WebEndpoint(name = "BillConsultServicePort")
    public BillService getBillConsultServicePort() {
        return super.getPort(BillConsultServicePort, BillService.class);
    }

    /**
     * This method gets the bill service port.
     *
     * @param features A list of {@link WebServiceFeature} to configure on the proxy.
     *                 Supported features not in the <code>features</code> parameter will have
     *                 their default values.
     * @return Returns the bill service port.
     */
    @WebEndpoint(name = "BillConsultServicePort")
    public BillService getBillConsultServicePort(WebServiceFeature... features) {
        return super.getPort(BillConsultServicePort, BillService.class, features);
    }

} 