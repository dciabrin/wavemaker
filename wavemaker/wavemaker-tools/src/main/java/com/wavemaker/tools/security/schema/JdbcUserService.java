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
// Generated on: 2012.12.06 at 01:44:45 PM PST 
//


package com.wavemaker.tools.security.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.springframework.org/schema/security}jdbc-user-service.attlist"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class JdbcUserService {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlAttribute(name = "data-source-ref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataSourceRef;
    @XmlAttribute(name = "cache-ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cacheRef;
    @XmlAttribute(name = "users-by-username-query")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String usersByUsernameQuery;
    @XmlAttribute(name = "authorities-by-username-query")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authoritiesByUsernameQuery;
    @XmlAttribute(name = "group-authorities-by-username-query")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupAuthoritiesByUsernameQuery;
    @XmlAttribute(name = "role-prefix")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rolePrefix;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dataSourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceRef() {
        return dataSourceRef;
    }

    /**
     * Sets the value of the dataSourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceRef(String value) {
        this.dataSourceRef = value;
    }

    /**
     * Gets the value of the cacheRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheRef() {
        return cacheRef;
    }

    /**
     * Sets the value of the cacheRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheRef(String value) {
        this.cacheRef = value;
    }

    /**
     * Gets the value of the usersByUsernameQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsersByUsernameQuery() {
        return usersByUsernameQuery;
    }

    /**
     * Sets the value of the usersByUsernameQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsersByUsernameQuery(String value) {
        this.usersByUsernameQuery = value;
    }

    /**
     * Gets the value of the authoritiesByUsernameQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoritiesByUsernameQuery() {
        return authoritiesByUsernameQuery;
    }

    /**
     * Sets the value of the authoritiesByUsernameQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoritiesByUsernameQuery(String value) {
        this.authoritiesByUsernameQuery = value;
    }

    /**
     * Gets the value of the groupAuthoritiesByUsernameQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupAuthoritiesByUsernameQuery() {
        return groupAuthoritiesByUsernameQuery;
    }

    /**
     * Sets the value of the groupAuthoritiesByUsernameQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupAuthoritiesByUsernameQuery(String value) {
        this.groupAuthoritiesByUsernameQuery = value;
    }

    /**
     * Gets the value of the rolePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolePrefix() {
        return rolePrefix;
    }

    /**
     * Sets the value of the rolePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolePrefix(String value) {
        this.rolePrefix = value;
    }

}
