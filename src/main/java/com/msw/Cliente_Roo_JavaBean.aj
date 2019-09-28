// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.msw;

import com.msw.Cliente;
import java.util.Objects;

privileged aspect Cliente_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Cliente.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Cliente
     */
    public Cliente Cliente.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer Cliente.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Cliente
     */
    public Cliente Cliente.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets razonSocial value
     * 
     * @return String
     */
    public String Cliente.getRazonSocial() {
        return this.razonSocial;
    }
    
    /**
     * Sets razonSocial value
     * 
     * @param razonSocial
     * @return Cliente
     */
    public Cliente Cliente.setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
        return this;
    }
    
    /**
     * Gets documento value
     * 
     * @return String
     */
    public String Cliente.getDocumento() {
        return this.documento;
    }
    
    /**
     * Sets documento value
     * 
     * @param documento
     * @return Cliente
     */
    public Cliente Cliente.setDocumento(String documento) {
        this.documento = documento;
        return this;
    }
    
    /**
     * Gets telefono value
     * 
     * @return String
     */
    public String Cliente.getTelefono() {
        return this.telefono;
    }
    
    /**
     * Sets telefono value
     * 
     * @param telefono
     * @return Cliente
     */
    public Cliente Cliente.setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }
    
    /**
     * Gets email value
     * 
     * @return String
     */
    public String Cliente.getEmail() {
        return this.email;
    }
    
    /**
     * Sets email value
     * 
     * @param email
     * @return Cliente
     */
    public Cliente Cliente.setEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean Cliente.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Cliente)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Cliente) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Cliente.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Cliente.toString() {
        return "Cliente {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", razonSocial='" + razonSocial + '\'' + 
                ", documento='" + documento + '\'' + 
                ", telefono='" + telefono + '\'' + 
                ", email='" + email + '\'' + "}" + super.toString();
    }
    
}
