// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.msw.dao;

import com.msw.Producto;
import com.msw.Proveedor;
import com.msw.QProducto;
import com.msw.dao.ProductoRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect ProductoRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: ProductoRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProductoRepositoryImpl.NOMBRE = "nombre";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProductoRepositoryImpl.DESCRIPCION = "descripcion";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String ProductoRepositoryImpl.PROVEEDOR = "proveedor";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Producto> ProductoRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QProducto producto = QProducto.producto;
        
        JPQLQuery<Producto> query = from(producto);
        
        Path<?>[] paths = new Path<?>[] {producto.nombre,producto.descripcion,producto.proveedor};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(NOMBRE, producto.nombre)
			.map(DESCRIPCION, producto.descripcion)
			.map(PROVEEDOR, producto.proveedor);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, producto);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Producto> ProductoRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QProducto producto = QProducto.producto;
        
        JPQLQuery<Producto> query = from(producto);
        
        Path<?>[] paths = new Path<?>[] {producto.nombre,producto.descripcion,producto.proveedor};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(producto.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(NOMBRE, producto.nombre)
			.map(DESCRIPCION, producto.descripcion)
			.map(PROVEEDOR, producto.proveedor);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, producto);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param proveedor
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Producto> ProductoRepositoryImpl.findByProveedor(Proveedor proveedor, GlobalSearch globalSearch, Pageable pageable) {
        
        QProducto producto = QProducto.producto;
        
        JPQLQuery<Producto> query = from(producto);
        
        Assert.notNull(proveedor, "proveedor is required");
        
        query.where(producto.proveedor.eq(proveedor));
        Path<?>[] paths = new Path<?>[] {producto.nombre,producto.descripcion,producto.proveedor};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(NOMBRE, producto.nombre)
			.map(DESCRIPCION, producto.descripcion)
			.map(PROVEEDOR, producto.proveedor);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, producto);
    }
    
}
