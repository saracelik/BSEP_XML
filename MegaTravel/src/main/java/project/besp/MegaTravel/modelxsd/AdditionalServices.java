//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.11 at 07:32:39 PM CEST 
//


package project.besp.MegaTravel.modelxsd;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *               &lt;enumeration value="parking"/>
 *               &lt;enumeration value="WiFi"/>
 *               &lt;enumeration value="breakfast"/>
 *               &lt;enumeration value="half borad"/>
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="full board"/>
 *               &lt;enumeration value="all inclusive"/>
 *               &lt;enumeration value="pet friendly"/>
 *               &lt;enumeration value="TV"/>
 *               &lt;enumeration value="kitchen"/>
 *               &lt;enumeration value="bathroom"/>
 *               &lt;enumeration value="free canceling"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="priceOfAdd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
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
    "id",
    "name",
    "priceOfAdd",
    "accommodations",
    "accommodation_units"
})
@Entity
@Table(name="additional_services")
public class AdditionalServices {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "additional_id", nullable = false, updatable = false)
    protected long id;
   
	@XmlElement(required = true)
    protected String name;
    
	protected double price_of_add;

	@ManyToMany(mappedBy = "additional_services")
	private List<Accommodation> accommodations;
	
	@ManyToMany(mappedBy = "additional_services")
    private List<AccommodationUnit> accommodation_units;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priceOfAdd property.
     * 
     */
    public double getPriceOfAdd() {
        return price_of_add;
    }

    /**
     * Sets the value of the priceOfAdd property.
     * 
     */
    public void setPriceOfAdd(double value) {
        this.price_of_add = value;
    }

	public double getPrice_of_add() {
		return price_of_add;
	}

	public void setPrice_of_add(double price_of_add) {
		this.price_of_add = price_of_add;
	}

	public List<Accommodation> getAccommodations() {
		return accommodations;
	}

	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}

	public List<AccommodationUnit> getAccommodation_units() {
		return accommodation_units;
	}

	public void setAccommodation_units(List<AccommodationUnit> accommodation_units) {
		this.accommodation_units = accommodation_units;
	}



}
