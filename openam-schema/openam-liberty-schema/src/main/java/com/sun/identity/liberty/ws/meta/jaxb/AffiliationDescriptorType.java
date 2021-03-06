//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.meta.jaxb;


/**
 * Java content class for affiliationDescriptorType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-metadata.xsd line 222)
 * <p>
 * <pre>
 * &lt;complexType name="affiliationDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffiliateMember" type="{urn:liberty:metadata:2003-08}entityIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:metadata:2003-08}Extension" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:metadata:2003-08}KeyDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="affiliationID" use="required" type="{urn:liberty:metadata:2003-08}entityIDType" />
 *       &lt;attribute name="affiliationOwnerID" use="required" type="{urn:liberty:metadata:2003-08}entityIDType" />
 *       &lt;attribute name="cacheDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AffiliationDescriptorType {


    /**
     * Gets the value of the KeyDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the KeyDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.meta.jaxb.KeyDescriptorElement}
     * {@link com.sun.identity.liberty.ws.meta.jaxb.KeyDescriptorType}
     * 
     */
    java.util.List getKeyDescriptor();

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.meta.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.meta.jaxb.ExtensionType}
     */
    com.sun.identity.liberty.ws.meta.jaxb.ExtensionType getExtension();

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.meta.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.meta.jaxb.ExtensionType}
     */
    void setExtension(com.sun.identity.liberty.ws.meta.jaxb.ExtensionType value);

    /**
     * Gets the value of the affiliationID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAffiliationID();

    /**
     * Sets the value of the affiliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAffiliationID(java.lang.String value);

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getValidUntil();

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setValidUntil(java.util.Calendar value);

    /**
     * Gets the value of the AffiliateMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AffiliateMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliateMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getAffiliateMember();

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the cacheDuration property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCacheDuration();

    /**
     * Sets the value of the cacheDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCacheDuration(java.lang.String value);

    /**
     * Gets the value of the affiliationOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAffiliationOwnerID();

    /**
     * Sets the value of the affiliationOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAffiliationOwnerID(java.lang.String value);

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType}
     */
    com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType getSignature();

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType}
     */
    void setSignature(com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType value);

}
