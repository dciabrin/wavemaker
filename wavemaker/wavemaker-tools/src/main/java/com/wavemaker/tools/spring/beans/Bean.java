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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/02/2007 10:39 AM(ffu)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.26 at 04:39:33 PM PST 
//

package com.wavemaker.tools.spring.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}identifiedType">
 *       &lt;group ref="{http://www.springframework.org/schema/beans}beanElements"/>
 *       &lt;attGroup ref="{http://www.springframework.org/schema/beans}beanAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "description", "metasAndConstructorArgsAndProperties" })
@XmlRootElement(name = "bean")
public class Bean extends IdentifiedType {

    protected Description description;

    @XmlElementRefs({
        @XmlElementRef(name = "replaced-method", namespace = "http://www.springframework.org/schema/beans", type = ReplacedMethod.class),
        @XmlElementRef(name = "property", namespace = "http://www.springframework.org/schema/beans", type = Property.class),
        @XmlElementRef(name = "meta", namespace = "http://www.springframework.org/schema/beans", type = Meta.class),
        @XmlElementRef(name = "lookup-method", namespace = "http://www.springframework.org/schema/beans", type = LookupMethod.class),
        @XmlElementRef(name = "constructor-arg", namespace = "http://www.springframework.org/schema/beans", type = ConstructorArg.class) })
    @XmlAnyElement(lax = true)
    protected List<Object> metasAndConstructorArgsAndProperties;

    @XmlAttribute
    protected String name;

    @XmlAttribute(name = "class")
    protected String clazz;

    @XmlAttribute
    protected String parent;

    @XmlAttribute
    protected String scope;

    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;

    @XmlAttribute(name = "lazy-init")
    protected DefaultableBoolean lazyInit;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autowire;

    @XmlAttribute(name = "dependency-check")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dependencyCheck;

    @XmlAttribute(name = "depends-on")
    protected String dependsOn;

    @XmlAttribute(name = "init-method")
    protected String initMethod;

    @XmlAttribute(name = "destroy-method")
    protected String destroyMethod;

    @XmlAttribute(name = "factory-method")
    protected String factoryMethod;

    @XmlAttribute(name = "factory-bean")
    protected String factoryBean;

    @XmlAttribute(name = "autowire-candidate")
    protected Boolean autowireCandidate;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {
        return this.description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the metasAndConstructorArgsAndProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the metasAndConstructorArgsAndProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMetasAndConstructorArgsAndProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Property } {@link Meta } {@link ReplacedMethod }
     * {@link Object } {@link ConstructorArg } {@link LookupMethod }
     * 
     * 
     */
    public List<Object> getMetasAndConstructorArgsAndProperties() {
        if (this.metasAndConstructorArgsAndProperties == null) {
            this.metasAndConstructorArgsAndProperties = new ArrayList<Object>();
        }
        return this.metasAndConstructorArgsAndProperties;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClazz() {
        return this.clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getParent() {
        return this.parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean getAbstract() {
        return this._abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the lazyInit property.
     * 
     * @return possible object is {@link DefaultableBoolean }
     * 
     */
    public DefaultableBoolean getLazyInit() {
        if (this.lazyInit == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return this.lazyInit;
        }
    }

    /**
     * Sets the value of the lazyInit property.
     * 
     * @param value allowed object is {@link DefaultableBoolean }
     * 
     */
    public void setLazyInit(DefaultableBoolean value) {
        this.lazyInit = value;
    }

    /**
     * Gets the value of the autowire property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAutowire() {
        if (this.autowire == null) {
            return "default";
        } else {
            return this.autowire;
        }
    }

    /**
     * Sets the value of the autowire property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAutowire(String value) {
        this.autowire = value;
    }

    /**
     * Gets the value of the dependencyCheck property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDependencyCheck() {
        if (this.dependencyCheck == null) {
            return "default";
        } else {
            return this.dependencyCheck;
        }
    }

    /**
     * Sets the value of the dependencyCheck property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDependencyCheck(String value) {
        this.dependencyCheck = value;
    }

    /**
     * Gets the value of the dependsOn property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDependsOn() {
        return this.dependsOn;
    }

    /**
     * Sets the value of the dependsOn property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDependsOn(String value) {
        this.dependsOn = value;
    }

    /**
     * Gets the value of the initMethod property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInitMethod() {
        return this.initMethod;
    }

    /**
     * Sets the value of the initMethod property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setInitMethod(String value) {
        this.initMethod = value;
    }

    /**
     * Gets the value of the destroyMethod property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDestroyMethod() {
        return this.destroyMethod;
    }

    /**
     * Sets the value of the destroyMethod property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDestroyMethod(String value) {
        this.destroyMethod = value;
    }

    /**
     * Gets the value of the factoryMethod property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFactoryMethod() {
        return this.factoryMethod;
    }

    /**
     * Sets the value of the factoryMethod property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFactoryMethod(String value) {
        this.factoryMethod = value;
    }

    /**
     * Gets the value of the factoryBean property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFactoryBean() {
        return this.factoryBean;
    }

    /**
     * Sets the value of the factoryBean property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFactoryBean(String value) {
        this.factoryBean = value;
    }

    /**
     * Gets the value of the autowireCandidate property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean getAutowireCandidate() {
        return this.autowireCandidate;
    }

    /**
     * Sets the value of the autowireCandidate property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAutowireCandidate(Boolean value) {
        this.autowireCandidate = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of
     * this design, there's no setter.
     * 
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return this.otherAttributes;
    }

    /**
     * Sets the value of the metasAndConstructorArgsAndProperties property.
     * 
     * @param metasAndConstructorArgsAndProperties allowed object is {@link Property } {@link Meta }
     *        {@link ReplacedMethod } {@link Object } {@link ConstructorArg } {@link LookupMethod }
     * 
     */
    public void setMetasAndConstructorArgsAndProperties(List<Object> metasAndConstructorArgsAndProperties) {
        this.metasAndConstructorArgsAndProperties = metasAndConstructorArgsAndProperties;
    }

    // --simple--preserve

    /**
     * Returns the Property with the specified name.
     * 
     * @param id The Property name
     * @return The Property instance with the specified name
     */
    public Property getProperty(String name) {
        List<Object> properties = getMetasAndConstructorArgsAndProperties();
        for (Object o : properties) {
            if (o instanceof Property && name.equals(((Property) o).getName())) {
                return (Property) o;
            }
        }
        return null;
    }

    /**
     * Adds a property to this bean.
     * 
     * @param name The property name
     * @param value The property value
     */
    public void addProperty(String name, String value) {
        Property property = new Property();
        property.setName(name);
        property.setValue(value);
        addProperty(property);
    }

    /**
     * Adds a property to this bean.
     * 
     * @param property The <code>Property</code> object.
     */
    public void addProperty(Property property) {
        getMetasAndConstructorArgsAndProperties().add(property);
    }

    /**
     * Remove all bean properties.
     */
    public void removeProperties() {
        List<Object> properties = getMetasAndConstructorArgsAndProperties();
        for (Object o : new ArrayList<Object>(properties)) {
            if (o instanceof Property) {
                properties.remove(o);
            }
        }
    }

    /**
     * Returns a list of <code>ConstructorArg</code>s for this bean.
     * 
     * @return A list of <code>ConstructorArg</code>s.
     */
    public List<ConstructorArg> getConstructorArgs() {
        List<Object> list = getMetasAndConstructorArgsAndProperties();
        List<ConstructorArg> constructorArgs = new ArrayList<ConstructorArg>();
        for (Object o : list) {
            if (o instanceof ConstructorArg) {
                constructorArgs.add((ConstructorArg) o);
            }
        }
        return constructorArgs;
    }

    // --simple--preserve

}
