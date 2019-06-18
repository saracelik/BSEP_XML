//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.15 at 06:39:55 PM CEST 
//


package project.besp.MegaTravel.xsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommodation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="30"/>
 *                         &lt;whiteSpace value="replace"/>
 *                         &lt;pattern value="([a-zA-Z0-9 ])+"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([a-zA-Z0-9\. ])+"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cancelationDays">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="category">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                         &lt;enumeration value="5"/>
 *                         &lt;enumeration value="uncategorized"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rating">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.mega-travel/user}address"/>
 *                   &lt;element ref="{http://www.mega-travel/accommodation}location"/>
 *                   &lt;element ref="{http://www.mega-travel/accommodation}image" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.mega-travel/accommodation-unit}additional_services" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.mega-travel/accommodation-unit}accommodationUnit" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.mega-travel/user}user"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "accommodation"
})
@XmlRootElement(name = "PostAccommodationResponse")
public class PostAccommodationResponse {

    @XmlElement(required = true)
    protected Accommodation accommodation;

    /**
     * Gets the value of the accommodation property.
     * 
     * @return
     *     possible object is
     *     {@link PostAccommodationResponse.Accommodation }
     *     
     */
    public Accommodation getAccommodation() {
        return accommodation;
    }

    /**
     * Sets the value of the accommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAccommodationResponse.Accommodation }
     *     
     */
    public void setAccommodation(Accommodation value) {
        this.accommodation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="30"/>
     *               &lt;whiteSpace value="replace"/>
     *               &lt;pattern value="([a-zA-Z0-9 ])+"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="description">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="([a-zA-Z0-9\. ])+"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cancelationDays">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="category">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *               &lt;enumeration value="4"/>
     *               &lt;enumeration value="5"/>
     *               &lt;enumeration value="uncategorized"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="rating">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.mega-travel/user}address"/>
     *         &lt;element ref="{http://www.mega-travel/accommodation}location"/>
     *         &lt;element ref="{http://www.mega-travel/accommodation}image" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.mega-travel/accommodation-unit}additional_services" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.mega-travel/accommodation-unit}accommodationUnit" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.mega-travel/user}user"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
  
}
