//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.06 at 02:16:01 PM CEST 
//


package project.xml.AgentMegaTravel.model.reservation;

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
 *         &lt;element name="geoLength">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="-180"/>
 *               &lt;maxInclusive value="180"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="geoWidth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="-90"/>
 *               &lt;maxInclusive value="90"/>
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
@XmlType(name = "", propOrder = {
    "geoLength",
    "geoWidth"
})
@XmlRootElement(name = "location", namespace = "http://www.mega-travel/accommodation")
public class Location {

    @XmlElement(namespace = "http://www.mega-travel/accommodation")
    protected float geoLength;
    @XmlElement(namespace = "http://www.mega-travel/accommodation")
    protected float geoWidth;

    /**
     * Gets the value of the geoLength property.
     * 
     */
    public float getGeoLength() {
        return geoLength;
    }

    /**
     * Sets the value of the geoLength property.
     * 
     */
    public void setGeoLength(float value) {
        this.geoLength = value;
    }

    /**
     * Gets the value of the geoWidth property.
     * 
     */
    public float getGeoWidth() {
        return geoWidth;
    }

    /**
     * Sets the value of the geoWidth property.
     * 
     */
    public void setGeoWidth(float value) {
        this.geoWidth = value;
    }

}
