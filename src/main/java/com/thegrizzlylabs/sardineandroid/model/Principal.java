//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/27/2009 06:09 PM(mockbuild)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.23 at 06:27:19 PM PST 
//


package com.thegrizzlylabs.sardineandroid.model;

/**
 * <p>Java class for anonymous complex type.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//    "href","property","all","authenticated","unauthenticated","self"
//})
//@XmlRootElement(name = "principal")
public class Principal {

	private String href;
	private Property property;
	private All all;
	private Authenticated authenticated;
	private Unauthenticated unauthenticated;
	private Self self;
 

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public All getAll() {
		return all;
	}

	public void setAll(All all) {
		this.all = all;
	}

	public Authenticated getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Authenticated authenticated) {
		this.authenticated = authenticated;
	}

	public Unauthenticated getUnauthenticated() {
		return unauthenticated;
	}

	public void setUnauthenticated(Unauthenticated unauthenticated) {
		this.unauthenticated = unauthenticated;
	}

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}


}
