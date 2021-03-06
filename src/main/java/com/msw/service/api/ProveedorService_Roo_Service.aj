// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.msw.service.api;

import com.msw.Proveedor;
import com.msw.service.api.ProveedorService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ProveedorService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Proveedor
     */
    public abstract Proveedor ProveedorService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param proveedor
     */
    public abstract void ProveedorService.delete(Proveedor proveedor);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<Proveedor> ProveedorService.save(Iterable<Proveedor> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ProveedorService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Proveedor
     */
    public abstract Proveedor ProveedorService.save(Proveedor entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Proveedor
     */
    public abstract Proveedor ProveedorService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<Proveedor> ProveedorService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<Proveedor> ProveedorService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ProveedorService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Proveedor> ProveedorService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Proveedor> ProveedorService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param proveedor
     * @param productosToAdd
     * @return Proveedor
     */
    public abstract Proveedor ProveedorService.addToProductos(Proveedor proveedor, Iterable<Long> productosToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param proveedor
     * @param productosToRemove
     * @return Proveedor
     */
    public abstract Proveedor ProveedorService.removeFromProductos(Proveedor proveedor, Iterable<Long> productosToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param proveedor
     * @param productos
     * @return Proveedor
     */
    public abstract Proveedor ProveedorService.setProductos(Proveedor proveedor, Iterable<Long> productos);
    
}
