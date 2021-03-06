/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.18 at 11:24:03 AM MDT 
//


package org.openinfobutton.schemas.kb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="knowledgeUserType" type="{}CodedContextElement"/>
 *         &lt;element name="discipline" type="{}CodedContextElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeUser", propOrder = {
    "knowledgeUserType",
    "discipline"
})
public class KnowledgeUser {

    @XmlElement(required = true)
    protected CodedContextElement knowledgeUserType;
    protected CodedContextElement discipline;

    /**
     * Gets the value of the knowledgeUserType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedContextElement }
     *     
     */
    public CodedContextElement getKnowledgeUserType() {
        return knowledgeUserType;
    }

    /**
     * Sets the value of the knowledgeUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedContextElement }
     *     
     */
    public void setKnowledgeUserType(CodedContextElement value) {
        this.knowledgeUserType = value;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * @return
     *     possible object is
     *     {@link CodedContextElement }
     *     
     */
    public CodedContextElement getDiscipline() {
        return discipline;
    }

    /**
     * Sets the value of the discipline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedContextElement }
     *     
     */
    public void setDiscipline(CodedContextElement value) {
        this.discipline = value;
    }

}
