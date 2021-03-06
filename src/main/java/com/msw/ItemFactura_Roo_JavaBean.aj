// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.msw;

import com.msw.Factura;
import com.msw.ItemFactura;
import com.msw.Presentacion;
import java.math.BigDecimal;
import java.util.Objects;

privileged aspect ItemFactura_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long ItemFactura.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return ItemFactura
     */
    public ItemFactura ItemFactura.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer ItemFactura.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return ItemFactura
     */
    public ItemFactura ItemFactura.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets importe value
     * 
     * @return BigDecimal
     */
    public BigDecimal ItemFactura.getImporte() {
        return this.importe;
    }
    
    /**
     * Sets importe value
     * 
     * @param importe
     * @return ItemFactura
     */
    public ItemFactura ItemFactura.setImporte(BigDecimal importe) {
        this.importe = importe;
        return this;
    }
    
    /**
     * Gets cantidad value
     * 
     * @return Integer
     */
    public Integer ItemFactura.getCantidad() {
        return this.cantidad;
    }
    
    /**
     * Sets cantidad value
     * 
     * @param cantidad
     * @return ItemFactura
     */
    public ItemFactura ItemFactura.setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
        return this;
    }
    
    /**
     * Gets presentacion value
     * 
     * @return Presentacion
     */
    public Presentacion ItemFactura.getPresentacion() {
        return this.presentacion;
    }
    
    /**
     * Sets presentacion value
     * 
     * @param presentacion
     * @return ItemFactura
     */
    public ItemFactura ItemFactura.setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
        return this;
    }
    
    /**
     * Gets factura value
     * 
     * @return Factura
     */
    public Factura ItemFactura.getFactura() {
        return this.factura;
    }
    
    /**
     * Sets factura value
     * 
     * @param factura
     * @return ItemFactura
     */
    public ItemFactura ItemFactura.setFactura(Factura factura) {
        this.factura = factura;
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
    public boolean ItemFactura.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof ItemFactura)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((ItemFactura) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int ItemFactura.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ItemFactura.toString() {
        return "ItemFactura {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", importe='" + importe + '\'' + 
                ", cantidad='" + cantidad + '\'' + "}" + super.toString();
    }
    
}
