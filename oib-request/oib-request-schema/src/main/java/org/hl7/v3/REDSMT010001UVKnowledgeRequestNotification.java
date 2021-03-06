//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.05 at 09:40:03 AM MDT 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.KnowledgeRequestNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.KnowledgeRequestNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{}II.Lite" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="effectiveTime" type="{}TS.Lite" minOccurs="0" form="qualified"/>
 *         &lt;element name="patientContext" type="{}REDS_MT010001UV.PatientContext" minOccurs="0" form="qualified"/>
 *         &lt;element name="holder" type="{}REDS_MT010001UV.Holder" minOccurs="0" form="qualified"/>
 *         &lt;element name="performer" type="{}REDS_MT010001UV.Performer" minOccurs="0" form="qualified"/>
 *         &lt;element name="informationRecipient" type="{}REDS_MT010001UV.InformationRecipient" minOccurs="0" form="qualified"/>
 *         &lt;element name="taskContext" type="{}REDS_MT010001UV.TaskContext" form="qualified"/>
 *         &lt;element name="subTopic" type="{}REDS_MT010001UV.SubTopic" minOccurs="0" form="qualified"/>
 *         &lt;element name="mainSearchCriteria" type="{}REDS_MT010001UV.MainSearchCriteria" form="qualified"/>
 *         &lt;element name="encounter" type="{}REDS_MT010001UV.Encounter" minOccurs="0" form="qualified"/>
 *         &lt;element name="executionMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="TEST"/>
 *               &lt;enumeration value="DEVELOPMENT"/>
 *               &lt;enumeration value="PRODUCTION"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.KnowledgeRequestNotification", propOrder = {
    "id",
    "effectiveTime",
    "patientContext",
    "holder",
    "performer",
    "informationRecipient",
    "taskContext",
    "subTopic",
    "mainSearchCriteria",
    "encounter",
    "executionMode"
})
public class REDSMT010001UVKnowledgeRequestNotification {

    protected List<IILite> id;
    protected TSLite effectiveTime;
    @XmlElementRef(name = "patientContext", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVPatientContext> patientContext;
    @XmlElementRef(name = "holder", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVHolder> holder;
    @XmlElementRef(name = "performer", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVPerformer> performer;
    @XmlElementRef(name = "informationRecipient", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVInformationRecipient> informationRecipient;
    @XmlElement(required = true, nillable = true)
    protected REDSMT010001UVTaskContext taskContext;
    @XmlElementRef(name = "subTopic", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVSubTopic> subTopic;
    @XmlElement(required = true, nillable = true)
    protected REDSMT010001UVMainSearchCriteria mainSearchCriteria;
    @XmlElementRef(name = "encounter", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVEncounter> encounter;
    protected String executionMode;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IILite }
     * 
     * 
     */
    public List<IILite> getId() {
        if (id == null) {
            id = new ArrayList<IILite>();
        }
        return this.id;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link TSLite }
     *     
     */
    public TSLite getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSLite }
     *     
     */
    public void setEffectiveTime(TSLite value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the patientContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPatientContext }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVPatientContext> getPatientContext() {
        return patientContext;
    }

    /**
     * Sets the value of the patientContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPatientContext }{@code >}
     *     
     */
    public void setPatientContext(JAXBElement<REDSMT010001UVPatientContext> value) {
        this.patientContext = ((JAXBElement<REDSMT010001UVPatientContext> ) value);
    }

    /**
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVHolder }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVHolder> getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVHolder }{@code >}
     *     
     */
    public void setHolder(JAXBElement<REDSMT010001UVHolder> value) {
        this.holder = ((JAXBElement<REDSMT010001UVHolder> ) value);
    }

    /**
     * Gets the value of the performer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPerformer }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVPerformer> getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVPerformer }{@code >}
     *     
     */
    public void setPerformer(JAXBElement<REDSMT010001UVPerformer> value) {
        this.performer = ((JAXBElement<REDSMT010001UVPerformer> ) value);
    }

    /**
     * Gets the value of the informationRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVInformationRecipient }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVInformationRecipient> getInformationRecipient() {
        return informationRecipient;
    }

    /**
     * Sets the value of the informationRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVInformationRecipient }{@code >}
     *     
     */
    public void setInformationRecipient(JAXBElement<REDSMT010001UVInformationRecipient> value) {
        this.informationRecipient = ((JAXBElement<REDSMT010001UVInformationRecipient> ) value);
    }

    /**
     * Gets the value of the taskContext property.
     * 
     * @return
     *     possible object is
     *     {@link REDSMT010001UVTaskContext }
     *     
     */
    public REDSMT010001UVTaskContext getTaskContext() {
        return taskContext;
    }

    /**
     * Sets the value of the taskContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDSMT010001UVTaskContext }
     *     
     */
    public void setTaskContext(REDSMT010001UVTaskContext value) {
        this.taskContext = value;
    }

    /**
     * Gets the value of the subTopic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVSubTopic }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVSubTopic> getSubTopic() {
        return subTopic;
    }

    /**
     * Sets the value of the subTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVSubTopic }{@code >}
     *     
     */
    public void setSubTopic(JAXBElement<REDSMT010001UVSubTopic> value) {
        this.subTopic = ((JAXBElement<REDSMT010001UVSubTopic> ) value);
    }

    /**
     * Gets the value of the mainSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link REDSMT010001UVMainSearchCriteria }
     *     
     */
    public REDSMT010001UVMainSearchCriteria getMainSearchCriteria() {
        return mainSearchCriteria;
    }

    /**
     * Sets the value of the mainSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link REDSMT010001UVMainSearchCriteria }
     *     
     */
    public void setMainSearchCriteria(REDSMT010001UVMainSearchCriteria value) {
        this.mainSearchCriteria = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVEncounter }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVEncounter> getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVEncounter }{@code >}
     *     
     */
    public void setEncounter(JAXBElement<REDSMT010001UVEncounter> value) {
        this.encounter = ((JAXBElement<REDSMT010001UVEncounter> ) value);
    }

    /**
     * Gets the value of the executionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionMode() {
        return executionMode;
    }

    /**
     * Sets the value of the executionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionMode(String value) {
        this.executionMode = value;
    }

}
