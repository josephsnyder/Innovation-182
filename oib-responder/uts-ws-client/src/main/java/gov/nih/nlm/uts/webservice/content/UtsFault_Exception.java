
package gov.nih.nlm.uts.webservice.content;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UtsFault", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/")
public class UtsFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UtsFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UtsFault_Exception(String message, UtsFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UtsFault_Exception(String message, UtsFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: gov.nih.nlm.uts.webservice.content.UtsFault
     */
    public UtsFault getFaultInfo() {
        return faultInfo;
    }

}
