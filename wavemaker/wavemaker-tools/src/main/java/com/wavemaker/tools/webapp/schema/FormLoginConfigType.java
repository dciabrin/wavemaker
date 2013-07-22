/*
 *  Copyright (C) 2012-2013 CloudJee, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.07 at 09:51:34 AM PST 
//


package com.wavemaker.tools.webapp.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 	The form-login-configType specifies the login and error
 * 	pages that should be used in form based login. If form based
 * 	authentication is not used, these elements are ignored.
 * 
 * 	Used in: login-config
 * 
 *       
 * 
 * <p>Java class for form-login-configType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="form-login-configType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="form-login-page" type="{http://java.sun.com/xml/ns/javaee}war-pathType"/>
 *         &lt;element name="form-error-page" type="{http://java.sun.com/xml/ns/javaee}war-pathType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "form-login-configType", propOrder = {
    "formLoginPage",
    "formErrorPage"
})
public class FormLoginConfigType {

    @XmlElement(name = "form-login-page", required = true)
    protected WarPathType formLoginPage;
    @XmlElement(name = "form-error-page", required = true)
    protected WarPathType formErrorPage;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the formLoginPage property.
     * 
     * @return
     *     possible object is
     *     {@link WarPathType }
     *     
     */
    public WarPathType getFormLoginPage() {
        return formLoginPage;
    }

    /**
     * Sets the value of the formLoginPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarPathType }
     *     
     */
    public void setFormLoginPage(WarPathType value) {
        this.formLoginPage = value;
    }

    /**
     * Gets the value of the formErrorPage property.
     * 
     * @return
     *     possible object is
     *     {@link WarPathType }
     *     
     */
    public WarPathType getFormErrorPage() {
        return formErrorPage;
    }

    /**
     * Sets the value of the formErrorPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarPathType }
     *     
     */
    public void setFormErrorPage(WarPathType value) {
        this.formErrorPage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
